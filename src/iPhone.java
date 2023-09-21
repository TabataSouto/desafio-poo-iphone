public class iPhone {
    public static void main(String[] args) {
        AparelhoTelefonico phone = new AparelhoTelefonico();
        phone.setNumber("11943383072");
        phone.turnOn();
        phone.startVoiceMail("Por favor, me ligue!!");
        phone.getMessage();

        ReproduzirMusica musicPlay = new ReproduzirMusica();
        musicPlay.selectMusic("Melodies of life");
        musicPlay.play();
        musicPlay.pause();
        musicPlay.selectMusic("Space Melody");
    }
}
