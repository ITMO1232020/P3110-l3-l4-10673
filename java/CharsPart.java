public enum CharsPart {
    CARDIO_VASCULAR_SYSTEM("сердечно-сосудистая система"),
    ROPE("Верёвка"),
    LIGHTS("наши электрические фонарики"),
    NERVES(" нервы наши"),
    IMAGINATION("Воображение"),
    INTEREST("Интерес первооткрывателей и учёных"),
    SELF_CONTROL("самообладание."),
    COMPASS("по компасу");

    private final String TRANSLATE;

    CharsPart(String translate) {
        this.TRANSLATE = translate;
    }

    public String getTranslate() {
        return TRANSLATE;
    }

    @Override
    public String toString() {
        return "SubjectType{" +
                "translate='" + TRANSLATE + '\'' +
                '}';
    }
}
