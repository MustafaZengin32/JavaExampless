package encaptulations;

public class Encapsulation02 {

    private double not = 49.9;
    private boolean gecerMi = false;

    public Encapsulation02 () {
    }

    public void setNot(double not) {

        this.not = not;
    }

    public boolean isGecerMi() {

        if (this.not >= 50.0) {
            this.gecerMi = true;
        }

        return this.gecerMi;
    }
}


