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
