package temperatura;

public class Temperatura {
  private float temperatura;
  private boolean isCelcius;

  public Temperatura(float temperatura, boolean isCelcius) {
    this.temperatura = temperatura;
    this.isCelcius = isCelcius;
  }

  public double getFarenheit() {
    if (!this.isCelcius) {
      return this.temperatura;
    }
    return ((this.temperatura * 9) / 5) + 32;
  }

  public double getCelcius() {
    if (this.isCelcius) {
      return this.temperatura;
    }
    return ((this.temperatura - 32) * 5) / 9;
  }

}
