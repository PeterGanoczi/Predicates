package sk.itsovy.ganoczi.predicate;

public class City {

    private int population;
    private String code;
    private String district;
    private String name;

    public City(int population, String code, String district, String name) {
        this.population = population;
        this.code = code;
        this.district = district;
        this.name = name;
    }

    public City() {

    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "population=" + population +
                ", code='" + code + '\'' +
                ", district='" + district + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
