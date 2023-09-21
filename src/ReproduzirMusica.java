public class ReproduzirMusica {
    private String music;

    public void selectMusic(String newMusic) {
        this.music = newMusic;
        System.out.println("Música selecionada: " + newMusic);
    }

    public void play() {
        System.out.println("Tocando a música: " + music);
    }

    public void pause() {
        System.out.println("Música " + music + " pausada");
    }
}
