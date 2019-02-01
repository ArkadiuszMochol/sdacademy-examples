package pl.sdacademy.patterns.visitor.example.model;

public class Invitation {

    private String invitationText;

    public Invitation(String invitationText) {
        this.invitationText = invitationText;
    }

    public String getInvitationText() {
        return invitationText;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "invitationText='" + invitationText + '\'' +
                '}';
    }
}
