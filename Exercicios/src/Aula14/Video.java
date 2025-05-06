package Aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private float views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if (this.reproduzindo) {
            System.out.println("O vídeo já está sendo reproduzido!");
        } 
        else {
            this.reproduzindo = true;
            System.out.println("O vídeo está sendo reproduzido");
        }
    }

    @Override
    public void pause() {
        if (this.reproduzindo) {
            System.out.println("O vídeo foi pausado!");
        }
        else {
            this.reproduzindo = false;
            System.out.println("O vídeo foi pausado!");
        }
    }

    @Override
    public void like() {
        this.curtidas += 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public float getViews() {
        return views;
    }

    public void setViews(float views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video{");
        sb.append("titulo=").append(titulo);
        sb.append(", avaliacao=").append(avaliacao);
        sb.append(", views=").append(views);
        sb.append(", curtidas=").append(curtidas);
        sb.append(", reproduzindo=").append(reproduzindo);
        sb.append('}');
        return sb.toString();
    }
    
}
