public enum LocationPart {
    ICECOVER("ледяным покровом."),
    ICECOVERSECOND("ледяного покрова"),
    TOPFLOOR("верхним этажам."),
    FLOOR("Пол"),
    FACADE("фасадом."),
    TERRACE("террасами."),
    THICKENING("округлым утолщением"),
    PAVEDFLOOR("выложенный сланцами пол."),
    BASRELIEFPORTAITRS("с барельефными портретами."),
    ICYSTONES(" по обледенелым камням"),
    GIANTRECTANGLE(" громадном прямоугольнике."),
    STONEDFLOOR(", с каменным полом."),
    WRECKAGE(" рухнувшие обломки каменных глыб"),
    LANE("проулок"),
    FIVECORNERSARCH("пятиконечие в архитектуре, "),
    DRAWOFORNAMENT("и рисунок нескольких сохранившихся орнаментов"),
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
