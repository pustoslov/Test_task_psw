package com.example.testtaskpsw.data

import com.example.testtaskpsw.R

val items: List<Item> = listOf(
    Item(
        category = "pizza",
        title = "Маргарита",
        description = "Пицца маргарита 30см на тонком тесте. Неаполитанская пицца округлой формы" +
                " с приподнятыми краями (корнишоне), украшенная измельченными вручную очищенными" +
                " помидорами, моцареллой (моцарелла буффало или фьор ди латте), свежими листьями" +
                " базилика и оливковым маслом первого отжима.",
        image = R.drawable.margarita,
        cost = 650.0
    ),
    Item(
        category = "pizza",
        title = "Пеперони",
        description = "Пицца пеперони 40см на тонком тесте. Пеперони - острая разновидность " +
                "салями итало-американского происхождения, приготовленная из вяленого мяса и" +
                " приправленная паприкой или разновидностями перца чили.",
        image = R.drawable.peperoni,
        cost = 600.0
    ),
    Item(
        category = "pizza",
        title = "Гавайская",
        description = "Гавайская пицца 30см на толстом тесте. Пицца, приготовляемая с " +
                "использованием белого соуса, сыра, ананасов, курицы и морепродуктов.",
        image = R.drawable.hawai,
        cost = 700.0
    ),
    Item(
        category = "pizza",
        title = "Четыре сезона",
        description = "Пицца четыре сезона 30см. на тонком тесте. итальянская пицца, которая" +
                " разделена на четыре части с четырьмя различными начинками, каждая из" +
                " которых представляет один сезон года.",
        image = R.drawable.seasons,
        cost = 750.0
    ),
    Item(
        category = "pizza",
        title = "Ветчина и грибы",
        description = "Пицца с ветчиной и грибами 35см. на тонком тесте. Просто объедение.",
        image = R.drawable.shrooms,
        cost = 800.0
    ),
    Item(
        category = "pizza",
        title = "Барбекю",
        description = "Пицца Барбекю 30см. на тонком тесте. Вроде бы пицца, а вроде как и барбекю.",
        image = R.drawable.barbeku,
        cost = 700.0
    ),
    Item(
        category = "sushi",
        title = "Роллы Филадельфия",
        description = "Филадельфия - один из старейших городов США, шестой по населению город" +
                " страны и самый населённый город штата Пенсильвания. Население агломерации" +
                " составляет 6 096 120 жителей. Расположен на реке Делавэр у побережья" +
                " Атлантического океана.",
        image = R.drawable.filadelfia,
        cost = 700.0
    ),
    Item(
        category = "sushi",
        title = "Роллы Калифорния",
        description = "Калифорния - штат США, расположенный на западном побережье страны," +
                " на берегу Тихого океана. Граничит с американскими штатами Орегон" +
                " (на севере), Невада (на востоке) и Аризона (на юго-востоке), а" +
                " также с мексиканским штатом Нижняя Калифорния (на юге).",
        image = R.drawable.california,
        cost = 600.0
    ),
    Item(
        category = "sushi",
        title = "Роллы Арканзас",
        description = "Арканзас - штат на юге США, находится в Юго-Западном регионе," +
                " в 2021 году население составило 3 042 231 человек, занимает 34-е место" +
                " среди штатов США. Название штата пришло из языка индейцев осейджи, которые" +
                " называли так своих соседей — сиуское племя куапо.",
        image = R.drawable.arcansas,
        cost = 550.0
    ),
    Item(
        category = "sushi",
        title = "Роллы Нью-Хэмпшир",
        description = "Нью-Хэмпшир - небольшой штат в регионе Новая Англия на" +
                " северо-востоке США. Население 1 379 089 (2020). Неофициальное название" +
                " «Гранитный штат» отражает наличие в штате месторождений гранита и его добычу.",
        image = R.drawable.new_hempshir,
        cost = 650.0
    ),
    Item(
        category = "sushi",
        title = "Роллы Висконсин",
        description = "Висконсин - штат США, находящийся на севере центральной части страны." +
                " Столицей штата является город Мадисон, крупнейшим городом — Милуоки.",
        image = R.drawable.visconsin_set,
        cost = 700.0
    ),
    Item(
        category = "sushi",
        title = "Роллы Нью-Мексико",
        description = "Нью-Мексико — юго-западный штат США. Обладая населением всего чуть" +
                " более, чем два миллиона человек, штат занимает пятое место в стране по" +
                " площади. Столица — Санта-Фе, самый же крупный город — Альбукерке.",
        image = R.drawable.new_mexico,
        cost = 700.0
    ),
    Item(
        category = "sushi",
        title = "Сет Северныя и Южная Дакота",
        description = "Дакоты - собирательный термин, обозначающий штаты Северная и" +
                " Южная Дакота. Территория Дакота.",
        image = R.drawable.south_and_north_dakota,
        cost = 800.0
    ),
    Item(
        category = "sushi",
        title = "Сет Конфедерация",
        description = "Конфедеративные Штаты - де-факто независимое государство," +
                " существовавшее в период с 1861 по 1865 год в южной части Северной Америки," +
                " на части территории современных Соединённых Штатов Америки.",
        image = R.drawable.confederat_set,
        cost = 2800.0
    ),
    Item(
        category = "wok",
        title = "Курица терияки",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.teriaki,
        cost = 600.0
    ),
    Item(
        category = "wok",
        title = "Вегетарианский",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.vegetarian,
        cost = 500.0
    ),
    Item(
        category = "wok",
        title = "Свинина и овощи",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.pork,
        cost = 650.0
    ),
    Item(
        category = "wok",
        title = "Креветки",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.shrimps,
        cost = 800.0
    ),
    Item(
        category = "wok",
        title = "Морепродукты",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.seafood,
        cost = 750.0
    ),
    Item(
        category = "wok",
        title = "Курица",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.chicken,
        cost = 600.0
    ),
    Item(
        category = "wok",
        title = "Лосось",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.salmon,
        cost = 670.0
    ),
    Item(
        category = "wok",
        title = "Рыба",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.fish,
        cost = 600.0
    ),
    Item(
        category = "drinks",
        title = "Добрый кола",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.dobriy,
        cost = 100.0
    ),
    Item(
        category = "drinks",
        title = "Cool кола",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.cool,
        cost = 120.0
    ),
    Item(
        category = "drinks",
        title = "Кола Черноголовка",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.chernogolovka,
        cost = 90.0
    ),
    Item(
        category = "drinks",
        title = "Терехино кола",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.terehino,
        cost = 80.0
    ),
    Item(
        category = "drinks",
        title = "Любимая кола",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin" +
                " vitae efficitur velit, in eleifend quam. Proin lacus sapien, luctus ut" +
                " ultrices ut, dictum nec metus. Vestibulum dolor quam, pulvinar sed volutpat" +
                " sed, molestie nec orci. Suspendisse nibh arcu, ultricies nec viverra a, congue" +
                " id sem. Duis nec nibh eu augue commodo vulputate vitae at nisl. Pellentesque" +
                " id tortor arcu. Maecenas pellentesque lorem magna, et ullamcorper urna" +
                " ultricies sed. Pellentesque nec molestie tellus.",
        image = R.drawable.lubimaya,
        cost = 100.0
    ),
)