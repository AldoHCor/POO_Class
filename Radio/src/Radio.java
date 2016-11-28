public class Radio {
    private boolean Power;
    private int volume;
    private String frequency;
    private double station;

    public Radio() {
        this.Power = false;
        this.volume = 0;
        this.frequency = "AM";
        this.station = 540.0D;
    }

    public Radio(boolean startPower, int startVolume, String startFrequency, double startStation) {
        this.Power = startPower;
        this.volume = startVolume;
        this.frequency = startFrequency;
        this.station = startStation;
    }

    public void setPower(boolean e) {
        this.Power = e;
    }

    public boolean getPower() {
        return this.Power;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public int getVolume() {
        return this.volume;
    }

    public String setFrequency(String f) {
        this.frequency = f;
        return this.frequency;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void changeFrequency(int freq) {
        if(freq == 1) {
            this.frequency = "AM";
        } else if(freq == 2) {
            this.frequency = "FM";
            System.out.println("No Valido");
        }

    }

    public void upDownVolume(int increment) {
        this.volume += increment;
        if(this.volume > 100 || this.volume < 0) {
            System.out.println("Invalid");
            this.volume -= increment;
        }

    }

    public void changeFrequency() {
        if(this.frequency.equals("AM")) {
            this.frequency = "FM";
            this.station = 88.0D;
        } else {
            this.frequency = "AM";
            this.station = 540.0D;
        }

    }

    public void changeStation(double fChange) {
        double a = fChange % 10.0D;
        if(this.frequency.equals("AM") && a == 0.0D) {
            this.station += fChange;
            if(this.station < 540.0D || this.station > 1600.0D) {
                System.out.println("Station out of range");
                this.station -= fChange;
            }
        }

        double b = fChange % 0.2D;
        if(this.frequency.equals("FM") && b == 0.0D) {
            this.station += fChange;
            if(this.station < 88.0D || this.station > 108.0D) {
                System.out.println("Station out of range");
                this.station -= fChange;
            }
        }

        if(a != 0.0D && b != 0.0D) {
            System.out.println("Invalid.");
        }

    }

    public void onAndOff() {
        this.Power = !this.Power;
    }

    public String toString() {
        String message = " ";
        if(this.Power) {
            message = "Radio on in frequency: " + this.frequency + ". in the station " + this.station + ". At a volume of " + this.volume + ".";
        } else {
            message = "Radio Off";
        }

        return message;
    }
}
