public enum Breed {
    GERMAN_DOG("Немецкий дог"),
    BULLDOG("Бульдог"),
    BEAGLE("Бигль"),
    SPANIEL("Спаниель"),
    TERRIER("Терьер");
    private String value;

    Breed(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
