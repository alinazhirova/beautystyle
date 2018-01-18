package com.zhirova.alina.beautystyle.hair;


import com.zhirova.alina.beautystyle.R;

public class Hair {

    private String name;
    private String description;
    private int imageResourceID;


    public static final Hair[] hairs = {
            new Hair("Ламинирование", "Ламинирование волос подразумевает собой нанесение особых составов," +
                    " покрывающих волосы их тонкой пленкой. Защитная пленка помогает удерживать внутри влагу, " +
                    "защищает от воздействия окружающей среды и заполняет полости и пустоты внутри волоса.",
                    R.drawable.lamination),
            new Hair("Свадебные прически", "В свадебном образе невесты все должно быть идеально, " +
                    "от красивых украшений до белоснежного платья, – и важнейшей частью роскошного стиля " +
                    "в незабываемый день становятся изысканные свадебные прически. К свадебной прическе предъявляются" +
                    " повышенные требования, ведь она должна не только помочь в создании утонченного, романтического" +
                    " и сказочного образа, но и с достоинством выдержать длительное торжество", R.drawable.wedding),
            new Hair("Стрижки", "Каждая женщина хотя бы раз в жизни мечтала полностью сменить имидж" +
                    " и кардинально изменить свой образ. Именно женская стрижка может полностью преобразить женщину," +
                    " сделать ее более яркой и эффектной. Удачно подобранная стрижка поможет скорректировать грубые " +
                    "черты лица и одновременно придаст очарование и изящество лицу.", R.drawable.haircuts)
    };


    public Hair(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public int getImageResourceID() {
        return imageResourceID;
    }


    public String toString() {
        return this.name;
    }

}
