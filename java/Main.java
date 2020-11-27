public class Main {
    public static void main(String[] args) {

        Characters we = new Characters("мы");

        City city = new City("город");
        City.GiantWall giantWall = city.new GiantWall("стенами-гигантами,",SubjectType.СHIPPED_AND_CRACKED);

        Action comeInTown = new Action(we.getName(), "вступили и стали продвигаться вперёд", "Когда наконец", city.getName());
        Action climbing = new Action(", карабкаясь","через"+LocationPart.WRECKAGE.getTranslate());
        Action feeling = new Action(" и чувствуя себя карликами", "рядом с "+giantWall.getSubjectType().getTranslate()+giantWall.getName());
        Action strain = new Action(CharsPart.NERVES.getTranslate(), "напряглись","до такой степени");
        Action saveComposure = new Action(we.getName(),"сохраняли",", что лишь чудом",CharsPart.SELF_CONTROL.getTranslate());
        System.out.println(comeInTown.describe()+climbing.describe()+feeling.describe()+strain.describe()+saveComposure.describe());

        Characters denfort = new Characters("Денфорт");

        City.Camp camp = city.new Camp("лагерь.");

        Action shudder = new Action(denfort.getName(),"вздрагивал","поминутно");
        Action harass = new Action(" и изводил меня", SubjectType.IRRELEVANT.getTranslate()+"предположениями относительно того");
        Action whatHappened = new Action(", что" , "на самом деле произошло", "в "+camp.getName());
        System.out.println(shudder.describe()+harass.describe()+whatHappened.describe());

        NatureEffects depth = new NatureEffects("тёмной пучины",SubjectType.DEEP_ANCIENT);

        Action beDisgusting = new Action("Мне", "они были","просто отвратительны: ведь ");
        Action riseFromTheDepths = new Action("поднявшегося", "из "+depth.getName()+depth.getSubjectType().getTranslate());
        Action direct = new Action("и меня","наталкивал","на определённые выводы.");
        Action push = new Action("вид этого ужасного " +city.getName()+"-колосса, " + riseFromTheDepths.describe(), direct.describe());
        System.out.println(beDisgusting.describe()+push.describe());

        Action imgPlay = new Action(CharsPart.IMAGINATION.getTranslate(), "разыгралось","у Денфорта не на шутку: ");
        Action insist = new Action("он","настаивал,","что там, где");
        Action makeTurn = new Action(SubjectType.DEBRIS_COVERED.getTranslate()+LocationPart.LANE.getTranslate(), "делает крутой поворот, ");
        Action seeTracks = new Action("видел",SubjectType.DEPRESSING.getTranslate()+SubjectType.UNCLEAR.getTranslate()+"следы.");
        System.out.println(imgPlay.describe()+insist.describe()+makeTurn.describe()+seeTracks.describe());

        Action lookAround = new Action("Он","оглядывался","постоянно, ");
        Action assuring = new Action("уверяя, что слышит",SubjectType.FROM_OUT_OF_NOWHERE.getTranslate()+"музыку"+SubjectType.MUTED.getTranslate()+"трубные звуки, напоминающие завывание ветра.");
        System.out.println(lookAround.describe()+assuring.describe());

        Action pointing = new Action(SubjectType.INTRUSIVE.getTranslate()+LocationPart.FIVE_CORNERS_ARCH.getTranslate()+LocationPart.DRAW_OF_ORNAMENT.getTranslate(), "наводили","на тревожные мысли.");
        System.out.println(pointing.describe());

        City.Creators creators = city.new Creators("первобытные создания, ");

        Action settleDown = new Action(SubjectType.TERRIBLE.getTranslate()+"догадка","поселилась","уже в нашем подсознании, ");
        Action whoWere = new Action("кем были",creators.getName());
        Action found = new Action("которые","воздвигли",SubjectType.BLASPHEMOUS.getTranslate()+city.getName());
        Action liveIn = new Action(" и жили","в нём.");
        System.out.println(settleDown.describe()+whoWere.describe()+found.describe()+liveIn.describe());

        Action notFade = new Action(CharsPart.INTEREST.getTranslate(), "не совсем угас","в нас, однако.");
        System.out.println(notFade.describe());

        Stones ministones = new Stones("кусочки камней от разных глыб - ");

        Action usingInBuilding = new Action("пород", "применявшихся", "в строительстве.");
        Action keepBeating = new Action(we.getName(), "продолжали механически отбивать", ministones.getName()+usingInBuilding.describe());
        System.out.println(keepBeating.describe());

        Action wanting = new Action("Хотелось набрать", "их побольше, ");
        Action define = new Action("чтобы точнее определить","возраст "+city.getName());
        System.out.println(wanting.describe()+define.describe());

        City.GiantWall giantWall1 = city.new GiantWall("громадные стены",SubjectType.EXTERNAL);
        Stones firstTypeStones = new Stones(" камней.",SubjectType.JURASSIC_AND_COMANCE);

        Action folded = new Action(giantWall1.getSubjectType().getTranslate()+giantWall1.getName(), "были сложены", firstTypeStones.getSubjectType().getTranslate()+firstTypeStones.getName());
        System.out.println(folded.describe());

        Stones secondTypeStones = new Stones("Камешка ",SubjectType.YOUNGER_THAN_PLIOCENE);

        Action notFound = new Action(secondTypeStones.getName()+secondTypeStones.getSubjectType().getTranslate(), "не нашлось бы", "во всём "+city.getName());
        System.out.println(notFound.describe());

        Action walking = new Action(we.getName(),"блуждали", "по городу, который ");
        Action wasDead = new Action("был мёртв","по крайней мере пятьсот тысяч лет, а может, и больше.");
        System.out.println(walking.describe()+wasDead.describe());

        Maze maze = new Maze("лабиринту ",SubjectType.GLOOMY,SubjectType.STONE);

        Action rotate = new Action("Кружа","по этому "+maze.getSubjectType1().getTranslate()+maze.getSubjectType2().getTranslate()+maze.getName());
        Action stop = new Action(we.getName(),"останавливались", "у каждого" +SubjectType.AFFORDABLE.getTranslate() + " отверстия, ");
        Action estimate = new Action("чтобы заглянуть внутрь и прикинуть,","нельзя ли туда забраться.");
        System.out.println(rotate.describe()+stop.describe()+estimate.describe());

        Maze.Windows windows = maze.new Windows("окошек.",SubjectType.SOME);
        Action unableToAchieve = new Action("Было невозможно дотянуться", windows.getSubjectType().getTranslate()+windows.getName());
        System.out.println(unableToAchieve.describe());

        Maze.Windows window1 = maze.new Windows("Другие");
        City.Ruins ruins = city.new Ruins("руины",SubjectType.INGROWN_INTO_ICE,SubjectType.OPEN_SKY);

        Action openView = new Action(window1.getName(),"открывали нашему взору", ruins.getSubjectType1().getTranslate()+ruins.getName()+ruins.getSubjectType2().getTranslate()+ruins.beLikeCastle.describe());
        System.out.println(openView.describe());

        Maze.Windows window2 = maze.new Windows("Одно",SubjectType.SPACIOUS_ENOUGH);
        NatureEffects abyss = new NatureEffects("бездна",SubjectType.REAL);
        Action attract = new Action(window2.getName()+window2.getSubjectType().getTranslate(),"так и манило воспользоваться им,","но под ним ");
        Action abyssGape = new Action(abyss.getSubjectType().getTranslate()+abyss.getName(),"разверзалась,","а ");
        Action notDiscern = new Action(we.getName(),"не разглядели", "никакого спуска.");
        System.out.println(attract.describe()+abyssGape.describe()+notDiscern.describe());

        Shutters shutters1 = new Shutters("ставни",SubjectType.SURVIVORS);

        Action comingAcross = new Action(shutters1.getSubjectType().getTranslate()+shutters1.getName(), "попадались", "нам несколько раз.");
        System.out.println(comingAcross.describe());

        Shutters.TreesMakingOf treeType1 = shutters1.new TreesMakingOf("Дерево",SubjectType.WHICH_MADE_OF);

        Action getStoned = new Action(treeType1.getName()+treeType1.getSubjectType().getTranslate(),"давно окаменело,","но ");
        Action varied = new Action("строение его, отдельные прожилки","различались", "ещё.");
        System.out.println(getStoned.describe()+varied.describe());

        Action gibby = new Action("Эта"+SubjectType.REVIVED.getTranslate()+"древность","кружила голову.");
        System.out.println(gibby.describe());

        Shutters.TreesMakingOf treeType2 = shutters1.new TreesMakingOf("деревьев",SubjectType.MEZO_HOLO_PINE);
        Shutters.TreesMakingOf treeType3 = shutters1.new TreesMakingOf("пальм",SubjectType.FAN_SHAPED);
        Shutters.TreesMakingOf treeType4 = shutters1.new TreesMakingOf("деревьев.",SubjectType.THIRD_PERIOD);

        Action toCut = new Action(shutters1.getName(), "вырезали", treeType2.getSubjectType().getTranslate()+treeType2.getName()+", а также"+treeType3.getSubjectType().getTranslate()+treeType3.getName()+" и"+treeType4.getSubjectType().getTranslate()+treeType4.getName());
        System.out.println(toCut.describe());

        Action nothingYonger = new Action("Ничего "+SubjectType.YOUNGER_THAN_PLIOCENE.getTranslate(),"и здесь.");
        System.out.println(nothingYonger.describe());

        Action judgingBy = new Action("Судя","по расположению "+shutters1.getName()+", ");
        Action saveSigns = new Action(LocationPart.TAGS.getTranslate(), "сохранились","по краям которых",SubjectType.FROM_OLD_LOOPS.getTranslate());
        Action fasten = new Action("они", "крепились","не только снаружи, но и внутри.");
        System.out.println(judgingBy.describe()+saveSigns.describe()+fasten.describe());

        Action jammed = new Action("Заклинило","их, казалось - ");
        Action toSurvive = new Action("пережив",SubjectType.RUSTY_METAL.getTranslate()+"крепления и запоры...");
        Action helpToSave = new Action("это","помогло им сохраниться,",toSurvive.describe());
        System.out.println(jammed.describe()+helpToSave.describe());

        Action attack = new Action(we.getName(),"напали","на целый ряд окон наконец - "+SubjectType.CROWNED_BUILDING.getTranslate()+LocationPart.GIANT_RECTANGLE.getTranslate());
        System.out.println(attack.describe());

        Action viewed = new Action("Просматривалась","сквозь них "+SubjectType.SPACIOUS.getTranslate()+SubjectType.WELL_SAVED.getTranslate()+"комната"+LocationPart.STONED_FLOOR.getTranslate());
        System.out.println(viewed.describe());

        Action toGoDown = new Action("Спуститься не представлялось возможным","туда без верёвки однако.");
        System.out.println(toGoDown.describe());

        Action ropeLie = new Action(CharsPart.ROPE.getTranslate(),"лежала","у нас в рюкзаке");
        System.out.println(ropeLie.describe());

        Action notWanting = new Action("Не хотелось возиться", "без крайней необходимости с"+SubjectType.TWENTY_FOOTS.getTranslate()+"связкой, особенно в такой" + SubjectType.RAREFIED.getTranslate()+"атмосфере, где ");
        Action overload = new Action(CharsPart.CARDIO_VASCULAR_SYSTEM.getTranslate(), "испытывала","большие перегрузки.");
        System.out.println(notWanting.describe()+overload.describe());

        Room room = new Room("комната",SubjectType.GIANT,LocationPart.BASRELIEFS,LocationPart.PORTAIRTS);
        Action giantRoomWas = new Action(room.getSubjectType().getTranslate()+room.getName(),"была главным вестибюлем или залом,","скорее всего");
        Action highlight = new Action(CharsPart.LIGHTS.getTranslate(), "высветили",", и",room.getLocationPart1().getTranslate()+room.getLocationPart2().getTranslate()+SubjectType.BLOW_MIND.getTranslate());
        Action goInLine = new Action("идущими широкой полосой","по стенам зала, и ");
        Action detach = new Action("отделенными друг от друга",SubjectType.TRADITIONAL.getTranslate()+LocationPart.ORNAMENT.getTranslate());
        System.out.println(giantRoomWas.describe()+highlight.describe()+goInLine.describe()+detach.describe());

        Action tryToRemember = new Action("Постаравшись получше запомнить","это место, ");
        Action decideToGoBack = new Action(we.getName(),"решили вернуться сюда","в том случае, если ");
        Action notFind = new Action("не найдём","ничего"+SubjectType.MORE_AFFORDABLE.getTranslate());
        System.out.println(tryToRemember.describe()+decideToGoBack.describe()+notFind.describe());

        WallOpening wallOpeningFirst = new WallOpening("проём в стене.", SubjectType.ARCHED, 6, 10);
        Action foundWallOpening = new Action(we.getName(), "отыскали", "В результате", wallOpeningFirst.getName());
        System.out.println(foundWallOpening.describe());
        System.out.println(wallOpeningFirst.describe());

        Bridge bridge = new Bridge("Мостик", SubjectType.AIR, 5);
        Action buildConnect = new Action(bridge.getName(), "соединял между собой здания", "прежде.");
        System.out.println(buildConnect.describe());
        System.out.println(bridge.describe());

        WallOpening wallOpeningSecond = new WallOpening("Эти сводчатые проходы");
        Action matching = new Action(wallOpeningSecond.getName(), "соответствовали", LocationPart.TOP_FLOOR.getTranslate());
        System.out.println(matching.describe());

        Action saving = new Action(LocationPart.FLOOR.getTranslate(), "сохранился", "к счастью и здесь.");
        System.out.println(saving.describe());

        BigBuilding bigBuilding = new BigBuilding("Это строение", LocationPart.FACADE, LocationPart.TERRACE, SubjectType.AFFORDABLE);
        Action directing = new Action(bigBuilding.getName() + bigBuilding.getSubjectType().getTranslate(), "обращено", "На запад", bigBuilding.getLocationPartFirst().getTranslate());
        System.out.println(directing.describe());
        Action goDown = new Action(bigBuilding.getName(), "спускалось ко льду", bigBuilding.getLocationPartSecond().getTranslate());
        System.out.println(goDown.describe());

        WallOpening wallOpeningThird = new WallOpening("Другой арочный проход");
        Action gape = new Action(wallOpeningThird.getName(), "зиял", "напротив него.");
        System.out.println(gape.describe());

        DeafBuilding deafBuilding = new DeafBuilding("Глухая постройка", SubjectType.CYLINDRICAL, SubjectType.SHABBY, LocationPart.THICKENING, 10);
        Action rise = new Action(deafBuilding.getName() + deafBuilding.getSubjectTypeFirst().getTranslate() + deafBuilding.getSubjectTypeSecond().getTranslate(), "возвышалась", "с венчающим её округлым утолщением.");
        System.out.println(rise.describe());
        System.out.println(deafBuilding.describe());

        Action entrance = new Action(we.getName(), "собираемся войти в первый дом,", "груда обломков поможет нам это сделать.");
        Action doubt = new Action(we.getName(), "подверглись сомнению", "на какое-то время.");
        Action waitCase = new Action(we.getName(), "ждали", "удобного случая и мечтали о нём.");
        System.out.println(waitCase.describe());
        System.out.println(doubt.describe());
        System.out.println(entrance.describe());

        Action notAfraid = new Action(we.getName(), "не побоялись влиться", "в эту стародавнюю мистерию, это правда.");
        System.out.println(notAfraid.describe());
        SurvivingBuilding survivingBuilding = new SurvivingBuilding("уцелевшее здание", SubjectType.ANCIENT);
        Action finallyComeIn = new Action("нам", "предстояло вновь собраться с духом и войти в", "Природа постепенно открывалась нам во всей своей чудовищной неповторимости,", survivingBuilding.getName() + survivingBuilding.getSubjectType().getTranslate());
        System.out.println(finallyComeIn.describe());

        WallOpening wallOpeningFourth = new WallOpening("провал в стене.");
        Lobby lobby = new Lobby("вестибюль", LocationPart.BASRELIEF_PORTAITRS, LocationPart.PAVED_FLOOR);
        Action climb = new Action(we.getName(), "заставили себя вскарабкаться" + LocationPart.ICY_STONES.getTranslate(), "В конце концов", "к " + wallOpeningFourth.getName());
        System.out.println(climb.describe());

        Action jumpOff = new Action(we.getName(), "спрыгнули на", "Сразу после этого", lobby.getLocationPartSecond().getTranslate());
        System.out.println(jumpOff.describe());

        Action locate = new Action(lobby.getName(), "находился", "Здесь, как мы ещё раньше разглядели", lobby.getLocationPartFirst().getTranslate());
        System.out.println(locate.describe());

        Action diverge = new Action(SubjectType.ARCHED.getTranslate()+" коридоры","расходились","отсюда во все стороны и, ");
        Action understanding = new Action("понимая, как легко заблудиться", "в этом сплетении коридоров и комнат, ");
        Action decideToTear = new Action(we.getName(),"решили, что пора рвать","бумагу.");
        System.out.println(diverge.describe()+understanding.describe()+decideToTear.describe());

        Action navigate = new Action(we.getName(), "ориентировались","До сих пор",CharsPart.COMPASS.getTranslate()+", а то и просто на глазок"+SubjectType.VISIBLE_FROM_EVERYWHERE.getTranslate()+"хребтам, ");
        Action obscure = new Action("заслоняемым","лишь ненадолго шпилями башен, но ");
        Action wasImpossible = new Action("это","было невозможно","теперь.");
        System.out.println(navigate.describe()+obscure.describe()+wasImpossible.describe());

        Action tear = new Action(we.getName(),"порвали","всю лишнюю бумагу и ");
        Action shove = new Action("запихнули","клочки в рюкзак Денфорта, ");
        Action decideToSpend = new Action("порешив тратить","ее по возможности экономнее.");
        System.out.println(tear.describe()+shove.describe()+decideToSpend.describe());

        NatureEffects draft = new NatureEffects("сквозняков");
        Action seemFit = new Action("Казался подходящим","этот способ: ");
        Action noDraft = new Action(draft.getName(),"не было","в старинном сооружении.");
        System.out.println(seemFit.describe()+noDraft.describe());

        NatureEffects wind = new NatureEffects("ветер");

        Action windRome = new Action(wind.getName(),"разгуляется","А в случае, если","вдруг всё же или ");
        Action paperRunOut = new Action("бумага","кончится,","");
        Action resort = new Action(we.getName(),"сможем прибегнуть",SubjectType.MORE_RELIABLE.getTranslate()+SubjectType.DEMANDING.getTranslate()+"начнем делать зарубки.");
        System.out.println(windRome.describe()+paperRunOut.describe()+resort.describe());

        Action stretch = new Action("этот лабиринт","простирается.","как далеко","");
        Action hardToFigureOut = new Action("Трудно было понять,",stretch.describe());
        System.out.println(hardToFigureOut.describe());

        NatureEffects geoCataclysm = new NatureEffects(" геологических катаклизмов.");

        Action touched = new Action("Строения в городе","соприкасались друг с другом","так тесно, что ");
        Action stelsCrossOver = new Action("можно было незаметно переходить","из одного в другое по мостикам прямо подо льдом, если, конечно, ");
        Action ifNotFace = new Action("не натолкнешься","на последствия"+geoCataclysm.getName());
        System.out.println(touched.describe()+stelsCrossOver.describe()+ifNotFace.describe());


        Action notMeet = new Action("Встречалось не так уж много",SubjectType.ICY.getTranslate()+"участков внутри.");
        System.out.println(notMeet.describe());

        NatureEffects iceStratum = new NatureEffects("на ледяную толщу, ");

        Action cameAcross = new Action(we.getName(),"натыкались","Там же, где всё-таки",iceStratum.getName());
        Action seeSurface = new Action(we.getName(),"видели","повсюду сквозь прозрачную поверхность","плотно закрытые ставни, ");
        Action prepare = new Action("город","специально подготовили","как будто","к нашествию холода - ");
        Action conserve = new Action("как бы законсервировали","на неопределенное время.");
        System.out.println(cameAcross.describe()+seeSurface.describe()+prepare.describe()+conserve.describe());

        Action getOff = new Action("Трудно было отделаться","от впечатления, что ");
        Action notLeaveFast = new Action("город","не бросили","в спешке,"+SubjectType.SUDDEN_TROUBLE.getTranslate());
        Action leaveConsiously = new Action("а покинули сознательно.","");
        System.out.println(getOff.describe()+notLeaveFast.describe()+leaveConsiously.describe());

        Action speechCouldNotGo = new Action("И речи","не могло идти","о постоянном вымирании.");
        System.out.println(speechCouldNotGo.describe());

        Characters characters = new Characters("жители");

        Action findOut = new Action(characters.getName(),"знали заранее","Может","о вторжении холода, ");
        Action goOut = new Action("может ушли","из города en masse, ");
        Action search = new Action("отправившись на поиски","более надежного пристанища?");
        Action translateFromFrench = new Action("En masse","- все вместе","(фр.).");
        System.out.println(findOut.describe()+goOut.describe()+search.describe());
        System.out.println(translateFromFrench.describe());

        Action couldNotAnswer = new Action("Нельзя ответить","с точностью,");
        Action contribute = new Action("какие"+SubjectType.GEOPHYSICAL.getTranslate()+"условия","способствовали образованию",couldNotAnswer.describe(),LocationPart.ICE_COVER_SECOND.getTranslate()+" в районе города.");
        System.out.println(contribute.describe());

        Action couldntBe = new Action("Это","не мог быть",SubjectType.LONG_AND_GRUELING.getTranslate()+"процесс.");
        System.out.println(couldntBe.describe());

        NatureEffects showAvalanche = new NatureEffects("снежная лавина");
        NatureEffects congestion = new NatureEffects("скоплении снега ",SubjectType.REDUNDANT);
        NatureEffects riverSpill = new NatureEffects("в разливе реки, ");
        NatureEffects mountainRages = new NatureEffects("горных хребтов.",SubjectType.GIANTIC);

        Action reasonHiding = new Action("причина","крылась","Возможно,",congestion.getSubjectType().getTranslate()+congestion.getName()+"или "+riverSpill.getName());
        Action brokeThrough = new Action(showAvalanche.getName(),"прорвала","а может,","заслоны, ");
        Action broughtDown = new Action("обрушившаяся","на город"+mountainRages.getSubjectType().getTranslate()+mountainRages.getName());
        System.out.println(reasonHiding.describe()+brokeThrough.describe()+broughtDown.describe());

        Action comeToMind = new Action("Могли прийти на ум","самые "+SubjectType.MOST_FANTASTIC.getTranslate()+"объяснения "+SubjectType.INCREDIBLE.getTranslate()+" месте.");
        System.out.println(comeToMind.describe());
    }
}
