package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rep {
    public String D;
    public String F;
    public String G;
    public String H;
    public String Pp;
    public String S;
    public String T;
    public String V;
    public String W;
    public String U;
    public String $;

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getF() {
        return F;
    }

    public void setF(String f) {
        F = f;
    }

    public String getG() {
        return G;
    }

    public void setG(String g) {
        G = g;
    }

    public String getH() {
        return H;
    }

    public void setH(String h) {
        H = h;
    }

    public String getPp() {
        return Pp;
    }

    public void setPp(String pp) {
        Pp = pp;
    }

    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public String getT() {
        return T;
    }

    public void setT(String t) {
        T = t;
    }

    public String getV() {
        return V;
    }

    public void setV(String v) {
        V = v;
    }

    public String getW() {
        if (W.equals("0")) {
            W = "Clear night";
        } else if (W.equals("1")) {
            W = "Sunny day";
        } else if (W.equals("2")) {
            W = "Partly cloudy (night)\n";
        } else if (W.equals("3")) {
            W = "Partly cloudy (day)";
        } else if (W.equals("4")) {
            W = "Not used";
        } else if (W.equals("5")) {
            W = "Mist";
        } else if (W.equals("6")) {
            W = "Fog";
        } else if (W.equals("7")) {
            W = "Cloudy";
        } else if (W.equals("8")) {
            W = "Overcast";
        } else if (W.equals("9")) {
            W = "Light rain shower (night)";
        } else if (W.equals("10")) {
            W = "Light rain shower (day)";
        } else if (W.equals("11")) {
            W = "Drizzle";
        } else if (W.equals("12")) {
            W = "Light rain";
        } else if (W.equals("13")) {
            W = "Heavy rain shower (night)";
        } else if (W.equals("14")) {
            W = "Heavy rain shower (day)";
        } else if (W.equals("15")) {
            W = "Heavy rain";
        } else if (W.equals("16")) {
            W = "Sleet shower (night)";
        } else if (W.equals("17")) {
            W = "Sleet shower (day)";
        } else if (W.equals("18")) {
            W = "Sleet";
        } else if (W.equals("19")) {
            W = "Hail shower (night)";
        } else if (W.equals("20")) {
            W = "Hail shower (day)";
        } else if (W.equals("21")) {
            W = "Hail";
        } else if (W.equals("22")) {
            W = "Light snow shower (night)";
        } else if (W.equals("23")) {
            W = "Light snow shower (day)";
        } else if (W.equals("24")) {
            W = "Light snow";
        } else if (W.equals("25")) {
            W = "Heavy snow shower (night)";
        } else if (W.equals("26")) {
            W = "Heavy snow shower (day)";
        } else if (W.equals("27")) {
            W = "Heavy snow";
        } else if (W.equals("28")) {
            W = "Thunder shower (night)";
        } else if (W.equals("29")) {
            W = "Thunder shower (day)";
        } else if (W.equals("30")) {
            W = "Thunder";
        }

        return W;
    }

    public void setW(String w) {
        W = w;
    }

    public String getU() {
        return U;
    }

    public void setU(String u) {
        this.U = u;
    }

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

    @Override
    public String toString() {
        return "Rep{" +
                "D='" + D + '\'' +
                ", F='" + F + '\'' +
                ", G='" + G + '\'' +
                ", H='" + H + '\'' +
                ", Pp='" + Pp + '\'' +
                ", S='" + S + '\'' +
                ", T='" + T + '\'' +
                ", V='" + V + '\'' +
                ", W='" + W + '\'' +
                ", U='" + U + '\'' +
                ", $='" + $ + '\'' +
                '}';
    }
}
