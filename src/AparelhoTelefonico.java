public class AparelhoTelefonico {
    private String number;
    private String message;

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public void turnOn() {
        System.out.println("Ligando para o número " + number);
    }

    public void startVoiceMail(String message) {
        System.out.println("Grave a sua mensagem!");
        this.setMessage(message);
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.err.println("A mensagem gravada foi: " + message);
    }
}
