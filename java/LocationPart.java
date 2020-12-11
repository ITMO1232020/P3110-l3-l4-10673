public enum LocationPart {
    ICE_COVER("ледяным покровом."),
    ICE_COVER_SECOND("ледяного покрова"),
    TOP_FLOOR("верхним этажам."),
    FLOOR("Пол"),
    FACADE("фасадом."),
    TERRACE("террасами."),
    THICKENING("округлым утолщением"),
    PAVED_FLOOR("выложенный сланцами пол."),
    BASRELIEF_PORTAITRS("с барельефными портретами."),
    ICY_STONES(" по обледенелым камням"),
    GIANT_RECTANGLE(" громадном прямоугольнике."),
    STONED_FLOOR(", с каменным полом."),
    WRECKAGE(" рухнувшие обломки каменных глыб"),
    LANE("проулок"),
    FIVE_CORNERS_ARCH("пятиконечие в архитектуре, "),
    DRAW_OF_ORNAMENT("и рисунок нескольких сохранившихся орнаментов"),
    TAGS("метки"),
    BASRELIEFS("чёткие барельефы "),
    PORTAIRTS("с резными портретами, "),
    ORNAMENT(" точечным орнаментом.");


    private final String TRANSLATE;

    LocationPart(String translate) {
        this.TRANSLATE = translate;
    }

    public String getTranslate() {
        return TRANSLATE;
    }

    @Override
    public String toString() {
        return "LocationPart{" +
                "translate='" + TRANSLATE + '\'' +
                '}';
    }
}
