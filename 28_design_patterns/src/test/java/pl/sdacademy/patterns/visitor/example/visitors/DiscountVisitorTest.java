package pl.sdacademy.patterns.visitor.example.visitors;

import org.junit.jupiter.api.Test;
import pl.sdacademy.patterns.visitor.example.customers.GroupCustomer;
import pl.sdacademy.patterns.visitor.example.customers.NormalCustomer;
import pl.sdacademy.patterns.visitor.example.customers.VipCustomer;
import pl.sdacademy.patterns.visitor.example.model.Discount;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class DiscountVisitorTest {

    @Test
    void testNormalCustomerGets10PercentsDiscount() {
        //given
        DiscountVisitor discountVisitor = new DiscountVisitor();
        NormalCustomer dummyCustomer = new NormalCustomer();

        //when
        Discount discount = dummyCustomer.accept(discountVisitor);

        //then
        assertThat(discount.getDiscount()).isBetween(0.09f, 0.11f);
    }

    @Test
    void testVipCustomerGets20PercentDiscountIfRankHigherThan5Or15Otherwise(){
        //given
        DiscountVisitor discountVisitor = new DiscountVisitor();
        VipCustomer minorRankVipCustomer = new VipCustomer("John", 4);
        VipCustomer higherRankVipCustomer = new VipCustomer("Eric", 10);

        //when
        Discount discount = minorRankVipCustomer.accept(discountVisitor);

        //then
        assertThat(discount.getDiscount()).isBetween(0.14f, 0.16f);

        //when
        discount = higherRankVipCustomer.accept(discountVisitor);

        //then
        assertThat(discount.getDiscount()).isBetween(0.19f, 0.21f);
    }

    @Test
    void testGroupCustomer() {
        //given
        DiscountVisitor discountVisitor = new DiscountVisitor();
        GroupCustomer smallGroup = new GroupCustomer(Arrays.asList("John", "ann"));
        GroupCustomer bigGroup = new GroupCustomer(Arrays.asList(
                "John", "Ann", "Jessie", "Paul", "Simon", "George", "Betty", "Adam"));

        //when
        Discount discount = smallGroup.accept(discountVisitor);

        //then
        assertThat(discount.getDiscount()).isBetween(0.09f, 0.11f);

        //when
        discount = bigGroup.accept(discountVisitor);

        //then
        assertThat(discount.getDiscount()).isBetween(0.29f, 0.31f);
    }

}