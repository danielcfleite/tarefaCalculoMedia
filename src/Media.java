package src;

public class Media {
  private int n1;
  private int n2;
  private int n3; 
  private int n4;
  private float media;

  public Media (int n1, int n2, int n3, int n4){
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    this.n4 = n4;
  }

  public static void main(String[] args) {
    Media mediaExemplo = new Media(2,4,6,8);
    float resultadoMedia = mediaExemplo.getMedia();
    System.out.println("A média é: " + resultadoMedia);
  }


  public float getMedia() {
    media = (float) (n1 + n2 + n3 + n4) / 4;
    return media;
}
}
