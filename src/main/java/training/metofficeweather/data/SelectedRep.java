package training.metofficeweather.data;


import training.metofficeweather.Rep;

public class SelectedRep {
    private Rep rep;
    private String name;
    private String country;
    private String date;

    public SelectedRep(Rep initRep, String initName, String initCountry, String initDate) {
        rep = initRep;
        name = initName;
        country = initCountry;
        date = initDate;

    }

    public Rep getRep() {
        return rep;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "SelectedRep{" +
                "rep=" + rep +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
