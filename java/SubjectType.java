public enum SubjectType {
    ARCHED("арочный"),
    CYLINDRICAL(" цилиндрической формы"),
    AIR("Воздушный"),
    AFFORDABLE(" доступное для нас"),
    SHABBY(" обшарпанная"),
    ANCIENT(" баснословно древней эпохи."),
    CROWNED_BUILDING("в венчавшем здание"),
    SPACIOUS("просторная, "),
    WELL_SAVED("хорошо сохранившаяся "),
    СHIPPED_AND_CRACKED("выщербленными и потрескавшимися "),
    DEBRIS_COVERED(" засыпанный обломками "),
    FROM_OUT_OF_NOWHERE("еле различимую, неведомо откуда доносящуюся "),
    MUTED(" - приглушённые "),
    INTRUSIVE("И навязчивое "),
    BLASPHEMOUS("этот богохульственный "),
    EXTERNAL("Внешние "),
    JURASSIC_AND_COMANCE("из юрских и команчских"),
    YOUNGER_THAN_PLIOCENE("моложе плиоцена"),
    GLOOMY("сумрачному "),
    STONE("каменному "),
    SOME("до некоторых "),
    INGROWN_INTO_ICE("вросшие в лёд "),
    OPEN_SKY(" под открытым небом,"),
    SPACIOUS_ENOUGH(", достаточно просторное,"),
    SURVIVORS("Уцелевшие "),
    WHICH_MADE_OF(", из которого их изготовили,"),
    REVIVED(" ожившая перед нами "),
    MEZO_HOLO_PINE("из мезозойских голосеменных хвойных "),
    FAN_SHAPED(" из веерных "),
    THIRD_PERIOD(" покрытосеменных третичного периода "),
    FROM_OLD_LOOPS("от давно распавшихся петель странной формы, "),
    RUSTY_METAL("изъеденные ржавчиной металлические "),
    TWENTY_FOOTS(" двадцатифутовой "),
    RAREFIED(" разряженной "),
    GIANT("Огромная "),
    BLOW_MIND("поражавшими воображение, "),
    TRADITIONAL("традиционным"),
    MORE_AFFORDABLE(" более доступного."),
    VISIBLE_FROM_EVERYWHERE(" - по видимым отовсюду "),
    MORE_RELIABLE("к более надёжному, "),
    DEMANDING("хотя и требующему больших усилий способу - "),
    MOST_FANTASTIC("самые фантастические "),
    INCREDIBLE("в этом невероятном"),
    REDUNDANT("в излишнем "),
    GIANTIC(" с гигантских "),
    LONG_AND_GRUELING("долгий, изнурительный "),
    GEOPHYSICAL(" геофизические "),
    SUDDEN_TROUBLE(" застигнутые внезапной бедой, "),
    ICY("обледеневших "),
    IRRELEVANT("совершенно неуместными и крайне неприятными "),
    DEEP_ANCIENT(" глубокой древности, "),
    DEPRESSING("удручившие его "),
    UNCLEAR("непонятные "),
    TERRIBLE("Ужасная "),
    REAL("настоящая "),
    NULL("");

    private final String TRANSLATE;

    SubjectType(String translate) {
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
