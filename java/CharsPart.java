public enum CharsPart {
    CARDIOVASCULARSYSTEM("сердечно-сосудистая система"),
    ROPE("Верёвка"),
    LIGHTS("наши электрические фонарики"),
    NERVES(" нервы наши"),
    IMAGINATION("Воображение"),
    INTEREST("Интерес первооткрывателей и учёных"),
    SELFCONTROL("самообладание.");


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
