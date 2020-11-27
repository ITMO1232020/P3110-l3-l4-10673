public enum SubjectType {
    ARCHED("арочный"),
    CYLINDRICAL(" цилиндрической формы"),
    AIR("Воздушный"),
    AFFORDABLE(" доступное для нас"),
    SHABBY(" обшарпанная"),
    ANCIENT(" баснословно древней эпохи."),
    CROWNEDBUILDING("в венчавшем здание"),
    SPACIOUS("просторная, "),
    WELLSAVED("хорошо сохранившаяся "),
    СHIPPEDANDCRACKED("выщербленными и потрескавшимися "),
    DEBRISCOVERED(" засыпанный обломками "),
    FROMOUTOFNOWHERE("еле различимую, неведомо откуда доносящуюся "),
    MUTED(" - приглушённые "),
    INTRUSIVE("И навязчивое "),
    BLASPHEMOUS("этот богохульственный "),
    EXTERNAL("Внешние "),
    JURASSICANDCOMANCE("из юрских и команчских"),
    YOUNGERTHANPLIOCENE("моложе плиоцена"),
    GLOOMY("сумрачному "),
    STONE("каменному "),
    SOME("до некоторых "),
    INGROWNINTOICE("вросшие в лёд "),
    OPENSKY(" под открытым небом,"),
    SPACIOUSENOUGH(", достаточно просторное,"),
    SURVIVORS("Уцелевшие "),
    WHICHMADEOF(", из которого их изготовили,"),
    REVIVED(" ожившая перед нами "),
    MEZOHOLOPINE("из мезозойских голосеменных хвойных "),
    FANSHAPED(" из веерных "),
    THIRDPERIOD(" покрытосеменных третичного периода "),
    FROMOLDLOOPS("от давно распавшихся петель странной формы, "),
    RUSTYMETAL("изъеденные ржавчиной металлические "),
    TWENTYFOOTS(" двадцатифутовой "),
    RAREFIED(" разряженной "),
    GIANT("Огромная "),
    BLOWMIND("поражавшими воображение, "),
    TRADITIONAL("традиционным"),
    MOREAFFORDABLE(" более доступного."),
    VISIBLEFROMEVERYWHERE(" - по видимым отовсюду "),
    MORERELIABLE("к более надёжному, "),
    DEMANDING("хотя и требующему больших усилий способу - "),
    MOSTFANTASTIC("самые фантастические "),
    INCREDIBLE("в этом невероятном"),
    REDUNDANT("в излишнем "),
    GIANTIC(" с гигантских "),
    LONGANDGRUELING("долгий, изнурительный "),
    GEOPHYSICAL(" геофизические "),
    SUDDENTROUBLE(" застигнутые внезапной бедой, "),
    ICY("обледеневших "),
    IRRELEVANT("совершенно неуместными и крайне неприятными "),
    DEEPANCIENT(" глубокой древности, "),
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
