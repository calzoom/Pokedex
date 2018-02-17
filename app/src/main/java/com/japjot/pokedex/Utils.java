/*    package com.japjot.pokedex;

    import java.util.ArrayList;

    public class Utils {
        final static String json = "{\n" +
                "   \"Abomasnow\":{\n" +
                "      \"#\":\"460\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"92\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Frost Tree Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"494\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Abomasnow ( Mega  Abomasnow )\":{\n" +
                "      \"#\":\"460\",\n" +
                "      \"Attack\":\"132\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"132\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"594\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Abra\":{\n" +
                "      \"#\":\"063\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"15\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"25\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Psi Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Absol\":{\n" +
                "      \"#\":\"359\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Disaster Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Absol ( Mega  Absol )\":{\n" +
                "      \"#\":\"359\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"565\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Accelgor\":{\n" +
                "      \"#\":\"617\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"When its body dries out, it weakens. So, to prevent dehydration, it wraps itself in many layers of thin membrane.\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Shell Out Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"145\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aegislash ( Blade  Forme )\":{\n" +
                "      \"#\":\"681\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aegislash ( Shield  Forme )\":{\n" +
                "      \"#\":\"681\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aerodactyl\":{\n" +
                "      \"#\":\"142\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Fossil Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"130\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aerodactyl ( Mega  Aerodactyl )\":{\n" +
                "      \"#\":\"142\",\n" +
                "      \"Attack\":\"135\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"150\",\n" +
                "      \"Total\":\"615\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aggron\":{\n" +
                "      \"#\":\"306\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"180\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Iron Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aggron ( Mega  Aggron )\":{\n" +
                "      \"#\":\"306\",\n" +
                "      \"Attack\":\"140\",\n" +
                "      \"Defense\":\"230\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"630\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aipom\":{\n" +
                "      \"#\":\"190\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Long Tail Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"360\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Alakazam\":{\n" +
                "      \"#\":\"065\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Psi Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"120\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Alakazam ( Mega  Alakazam )\":{\n" +
                "      \"#\":\"065\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"175\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"150\",\n" +
                "      \"Total\":\"590\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Alomomola\":{\n" +
                "      \"#\":\"594\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"It gently holds injured and weak Pok\\u00e9mon in its fins. Its special membrane heals their wounds.\",\n" +
                "      \"HP\":\"165\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Caring Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"470\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Altaria\":{\n" +
                "      \"#\":\"334\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Humming Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Altaria ( Mega  Altaria )\":{\n" +
                "      \"#\":\"334\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"590\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Amaura\":{\n" +
                "      \"#\":\"698\",\n" +
                "      \"Attack\":\"59\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"77\",\n" +
                "      \"Sp. Atk\":\"67\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Tundra Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"46\",\n" +
                "      \"Total\":\"362\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ambipom\":{\n" +
                "      \"#\":\"424\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"66\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"66\",\n" +
                "      \"Species\":\"Long Tail Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"482\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Amoonguss\":{\n" +
                "      \"#\":\"591\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"114\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Mushroom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"464\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ampharos\":{\n" +
                "      \"#\":\"181\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Light Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ampharos ( Mega  Ampharos )\":{\n" +
                "      \"#\":\"181\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"165\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"610\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Anorith\":{\n" +
                "      \"#\":\"347\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Old Shrimp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"355\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Arbok\":{\n" +
                "      \"#\":\"024\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"69\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"79\",\n" +
                "      \"Species\":\"Cobra Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"438\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Arcanine\":{\n" +
                "      \"#\":\"059\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Legendary Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"555\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Arceus\":{\n" +
                "      \"#\":\"493\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"120\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Alpha Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"120\",\n" +
                "      \"Total\":\"720\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Archen\":{\n" +
                "      \"#\":\"566\",\n" +
                "      \"Attack\":\"112\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"74\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"First Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"401\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Archeops\":{\n" +
                "      \"#\":\"567\",\n" +
                "      \"Attack\":\"140\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"112\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"First Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"567\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ariados\":{\n" +
                "      \"#\":\"168\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"Its feet are tipped with tiny hooked claws that enable it to scuttle on ceilings and vertical walls. It constricts its foe with thin and strong silk webbing.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Long Leg Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Armaldo\":{\n" +
                "      \"#\":\"348\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Plate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aromatisse\":{\n" +
                "      \"#\":\"683\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"72\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"101\",\n" +
                "      \"Sp. Atk\":\"99\",\n" +
                "      \"Sp. Def\":\"89\",\n" +
                "      \"Species\":\"Fragrance Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"29\",\n" +
                "      \"Total\":\"462\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aron\":{\n" +
                "      \"#\":\"304\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Iron Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Articuno\":{\n" +
                "      \"#\":\"144\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"Legendary bird POK\\u00e9MON. As it flies through the sky, it cools the air, causing snow to fall.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"125\",\n" +
                "      \"Species\":\"Freeze Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Audino\":{\n" +
                "      \"#\":\"531\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"86\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"103\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"86\",\n" +
                "      \"Species\":\"Hearing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"445\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Audino ( Mega  Audino )\":{\n" +
                "      \"#\":\"531\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"126\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"103\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"126\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"545\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Aurorus\":{\n" +
                "      \"#\":\"699\",\n" +
                "      \"Attack\":\"77\",\n" +
                "      \"Defense\":\"72\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"123\",\n" +
                "      \"Sp. Atk\":\"99\",\n" +
                "      \"Sp. Def\":\"92\",\n" +
                "      \"Species\":\"Tundra Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"521\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Avalugg\":{\n" +
                "      \"#\":\"713\",\n" +
                "      \"Attack\":\"117\",\n" +
                "      \"Defense\":\"184\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"46\",\n" +
                "      \"Species\":\"Iceberg Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"28\",\n" +
                "      \"Total\":\"514\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Axew\":{\n" +
                "      \"#\":\"610\",\n" +
                "      \"Attack\":\"87\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"They mark their territory by leaving gashes in trees with their tusks. If a tusk breaks, a new one grows in quickly.\",\n" +
                "      \"HP\":\"46\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Tusk Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"57\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Azelf\":{\n" +
                "      \"#\":\"482\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Willpower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Azumarill\":{\n" +
                "      \"#\":\"184\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Aqua Rabbit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Azurill\":{\n" +
                "      \"#\":\"298\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Polka Dot Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"190\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bagon\":{\n" +
                "      \"#\":\"371\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Rock Head Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Baltoy\":{\n" +
                "      \"#\":\"343\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Clay Doll Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Banette\":{\n" +
                "      \"#\":\"354\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"64\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Marionette Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Banette ( Mega  Banette )\":{\n" +
                "      \"#\":\"354\",\n" +
                "      \"Attack\":\"165\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"64\",\n" +
                "      \"Sp. Atk\":\"93\",\n" +
                "      \"Sp. Def\":\"83\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"555\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Barbaracle\":{\n" +
                "      \"#\":\"689\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"72\",\n" +
                "      \"Sp. Atk\":\"54\",\n" +
                "      \"Sp. Def\":\"86\",\n" +
                "      \"Species\":\"Collective Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"68\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Barboach\":{\n" +
                "      \"#\":\"339\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"43\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"46\",\n" +
                "      \"Sp. Def\":\"41\",\n" +
                "      \"Species\":\"Whiskers Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"288\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Basculin\":{\n" +
                "      \"#\":\"550\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Hostile Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"98\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bastiodon\":{\n" +
                "      \"#\":\"411\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"168\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"47\",\n" +
                "      \"Sp. Def\":\"138\",\n" +
                "      \"Species\":\"Shield Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bayleef\":{\n" +
                "      \"#\":\"153\",\n" +
                "      \"Attack\":\"62\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"63\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Leaf Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Beartic\":{\n" +
                "      \"#\":\"614\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Freezing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Beautifly\":{\n" +
                "      \"#\":\"267\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"Despite its looks, it is aggressive. It jabs with its long, thin mouth if disturbed while collecting pollen.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Butterfly Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"395\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Beedrill\":{\n" +
                "      \"#\":\"015\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Poison Bee Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"395\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Beedrill ( Mega  Beedrill )\":{\n" +
                "      \"#\":\"015\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"15\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"145\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Beheeyem\":{\n" +
                "      \"#\":\"606\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Cerebral Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Beldum\":{\n" +
                "      \"#\":\"374\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Iron Ball Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bellossom\":{\n" +
                "      \"#\":\"182\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Flower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bellsprout\":{\n" +
                "      \"#\":\"069\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"If it notices anything that moves, it immediately flings its vine at the object.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Flower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bergmite\":{\n" +
                "      \"#\":\"712\",\n" +
                "      \"Attack\":\"69\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"32\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Ice Chunk Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"28\",\n" +
                "      \"Total\":\"304\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bibarel\":{\n" +
                "      \"#\":\"400\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Beaver Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"71\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bidoof\":{\n" +
                "      \"#\":\"399\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"59\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Plump Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"31\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Binacle\":{\n" +
                "      \"#\":\"688\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"42\",\n" +
                "      \"Sp. Atk\":\"39\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Two-Handed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"306\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bisharp\":{\n" +
                "      \"#\":\"625\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"Bisharp pursues prey in the company of a large group of Pawniard. Then Bisharp finishes off the prey.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Sword Blade Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Blastoise\":{\n" +
                "      \"#\":\"009\",\n" +
                "      \"Attack\":\"83\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Shellfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"78\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Blastoise ( Mega  Blastoise )\":{\n" +
                "      \"#\":\"009\",\n" +
                "      \"Attack\":\"103\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"78\",\n" +
                "      \"Total\":\"630\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Blaziken\":{\n" +
                "      \"#\":\"257\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Blaze Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Blaziken ( Mega  Blaziken )\":{\n" +
                "      \"#\":\"257\",\n" +
                "      \"Attack\":\"160\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"630\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Blissey\":{\n" +
                "      \"#\":\"242\",\n" +
                "      \"Attack\":\"10\",\n" +
                "      \"Defense\":\"10\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"255\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"135\",\n" +
                "      \"Species\":\"Happiness Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Blitzle\":{\n" +
                "      \"#\":\"522\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"32\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"32\",\n" +
                "      \"Species\":\"Electrified Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"76\",\n" +
                "      \"Total\":\"295\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Boldore\":{\n" +
                "      \"#\":\"525\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Ore Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bonsly\":{\n" +
                "      \"#\":\"438\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"10\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Bonsai Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"10\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bouffalant\":{\n" +
                "      \"#\":\"626\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Bash Buffalo Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Braixen\":{\n" +
                "      \"#\":\"654\",\n" +
                "      \"Attack\":\"59\",\n" +
                "      \"Defense\":\"58\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"59\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"73\",\n" +
                "      \"Total\":\"409\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Braviary\":{\n" +
                "      \"#\":\"628\",\n" +
                "      \"Attack\":\"123\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"57\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Valiant Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Breloom\":{\n" +
                "      \"#\":\"286\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Mushroom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bronzong\":{\n" +
                "      \"#\":\"437\",\n" +
                "      \"Attack\":\"89\",\n" +
                "      \"Defense\":\"116\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"67\",\n" +
                "      \"Sp. Atk\":\"79\",\n" +
                "      \"Sp. Def\":\"116\",\n" +
                "      \"Species\":\"Bronze Bell Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"33\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bronzor\":{\n" +
                "      \"#\":\"436\",\n" +
                "      \"Attack\":\"24\",\n" +
                "      \"Defense\":\"86\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"57\",\n" +
                "      \"Sp. Atk\":\"24\",\n" +
                "      \"Sp. Def\":\"86\",\n" +
                "      \"Species\":\"Bronze Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"23\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Budew\":{\n" +
                "      \"#\":\"406\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Bud Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Buizel\":{\n" +
                "      \"#\":\"418\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Sea Weasel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bulbasaur\":{\n" +
                "      \"#\":\"001\",\n" +
                "      \"Attack\":\"49\",\n" +
                "      \"Defense\":\"49\",\n" +
                "      \"FlavorText\":\"While it is young, it uses the nutrients that are stored in the seeds on its back in order to grow.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Seed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"318\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Buneary\":{\n" +
                "      \"#\":\"427\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"44\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Rabbit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Bunnelby\":{\n" +
                "      \"#\":\"659\",\n" +
                "      \"Attack\":\"36\",\n" +
                "      \"Defense\":\"38\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"38\",\n" +
                "      \"Sp. Atk\":\"32\",\n" +
                "      \"Sp. Def\":\"36\",\n" +
                "      \"Species\":\"Digging Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"57\",\n" +
                "      \"Total\":\"237\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Burmy\":{\n" +
                "      \"#\":\"412\",\n" +
                "      \"Attack\":\"29\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"29\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Bagworm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"36\",\n" +
                "      \"Total\":\"224\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Butterfree\":{\n" +
                "      \"#\":\"012\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"It flits from flower to flower, collecting honey. It can even identify distant flowers in bloom.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Butterfly Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"395\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cacnea\":{\n" +
                "      \"#\":\"331\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Cactus Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cacturne\":{\n" +
                "      \"#\":\"332\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Scarecrow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Camerupt\":{\n" +
                "      \"#\":\"323\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Eruption Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Camerupt ( Mega  Camerupt )\":{\n" +
                "      \"#\":\"323\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"145\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"560\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Carbink\":{\n" +
                "      \"#\":\"703\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"Jewel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Carnivine\":{\n" +
                "      \"#\":\"455\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"72\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"74\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"72\",\n" +
                "      \"Species\":\"Bug Catcher Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"46\",\n" +
                "      \"Total\":\"454\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Carracosta\":{\n" +
                "      \"#\":\"565\",\n" +
                "      \"Attack\":\"108\",\n" +
                "      \"Defense\":\"133\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"74\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Prototurtle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"32\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Carvanha\":{\n" +
                "      \"#\":\"318\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"20\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"20\",\n" +
                "      \"Species\":\"Savage Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cascoon\":{\n" +
                "      \"#\":\"268\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Cocoon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"205\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Castform\":{\n" +
                "      \"#\":\"351\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Weather Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Caterpie\":{\n" +
                "      \"#\":\"010\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"It crawls into foliage where it camouflages itself among leaves that are the same color as its body.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"20\",\n" +
                "      \"Species\":\"Worm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"195\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Celebi\":{\n" +
                "      \"#\":\"251\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Time Travel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chandelure\":{\n" +
                "      \"#\":\"609\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"The spirits burned up in its ominous flame lose their way and wander this world forever.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"145\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Luring Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chansey\":{\n" +
                "      \"#\":\"113\",\n" +
                "      \"Attack\":\"5\",\n" +
                "      \"Defense\":\"5\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"250\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Egg Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Charizard\":{\n" +
                "      \"#\":\"006\",\n" +
                "      \"Attack\":\"84\",\n" +
                "      \"Defense\":\"78\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"109\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Flame Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"534\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Charizard ( Mega  Charizard  X )\":{\n" +
                "      \"#\":\"006\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"111\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"634\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Charizard ( Mega  Charizard  Y )\":{\n" +
                "      \"#\":\"006\",\n" +
                "      \"Attack\":\"104\",\n" +
                "      \"Defense\":\"78\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"159\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"634\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Charmander\":{\n" +
                "      \"#\":\"004\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"43\",\n" +
                "      \"FlavorText\":\"If it's healthy, the flame on the tip of its tail will burn vigorously, even if it gets a bit wet.\",\n" +
                "      \"HP\":\"39\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Lizard Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"309\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Charmeleon\":{\n" +
                "      \"#\":\"005\",\n" +
                "      \"Attack\":\"64\",\n" +
                "      \"Defense\":\"58\",\n" +
                "      \"FlavorText\":\"If it becomes agitated during battle, it spouts intense flames, incinerating its surroundings.\",\n" +
                "      \"HP\":\"58\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Flame Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chatot\":{\n" +
                "      \"#\":\"441\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"76\",\n" +
                "      \"Sp. Atk\":\"92\",\n" +
                "      \"Sp. Def\":\"42\",\n" +
                "      \"Species\":\"Music Note Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"91\",\n" +
                "      \"Total\":\"411\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cherrim\":{\n" +
                "      \"#\":\"421\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"87\",\n" +
                "      \"Sp. Def\":\"78\",\n" +
                "      \"Species\":\"Blossom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cherubi\":{\n" +
                "      \"#\":\"420\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"62\",\n" +
                "      \"Sp. Def\":\"53\",\n" +
                "      \"Species\":\"Cherry Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"275\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chesnaught\":{\n" +
                "      \"#\":\"652\",\n" +
                "      \"Attack\":\"107\",\n" +
                "      \"Defense\":\"122\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"88\",\n" +
                "      \"Sp. Atk\":\"74\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Spiny Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"64\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chespin\":{\n" +
                "      \"#\":\"650\",\n" +
                "      \"Attack\":\"61\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"56\",\n" +
                "      \"Sp. Atk\":\"48\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Spiny Nut Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"38\",\n" +
                "      \"Total\":\"313\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chikorita\":{\n" +
                "      \"#\":\"152\",\n" +
                "      \"Attack\":\"49\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"49\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Leaf Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"318\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chimchar\":{\n" +
                "      \"#\":\"390\",\n" +
                "      \"Attack\":\"58\",\n" +
                "      \"Defense\":\"44\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"44\",\n" +
                "      \"Species\":\"Chimp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"61\",\n" +
                "      \"Total\":\"309\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chimecho\":{\n" +
                "      \"#\":\"358\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"Its cries echo inside its hollow body to emerge as beautiful notes for startling and repelling foes.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Wind Chime Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"425\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chinchou\":{\n" +
                "      \"#\":\"170\",\n" +
                "      \"Attack\":\"38\",\n" +
                "      \"Defense\":\"38\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"56\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Angler Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"67\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Chingling\":{\n" +
                "      \"#\":\"433\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Bell Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"285\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cinccino\":{\n" +
                "      \"#\":\"573\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Scarf Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"470\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Clamperl\":{\n" +
                "      \"#\":\"366\",\n" +
                "      \"Attack\":\"64\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"74\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Bivalve Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"32\",\n" +
                "      \"Total\":\"345\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Clauncher\":{\n" +
                "      \"#\":\"692\",\n" +
                "      \"Attack\":\"53\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Water Gun Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"44\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Clawitzer\":{\n" +
                "      \"#\":\"693\",\n" +
                "      \"Attack\":\"73\",\n" +
                "      \"Defense\":\"88\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"71\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"89\",\n" +
                "      \"Species\":\"Howitzer Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"59\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Claydol\":{\n" +
                "      \"#\":\"344\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Clay Doll Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Clefable\":{\n" +
                "      \"#\":\"036\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"73\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Fairy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"483\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Clefairy\":{\n" +
                "      \"#\":\"035\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Fairy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"323\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cleffa\":{\n" +
                "      \"#\":\"173\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"28\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Star Shape Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"218\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cloyster\":{\n" +
                "      \"#\":\"091\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"180\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Bivalve Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cobalion\":{\n" +
                "      \"#\":\"638\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"129\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"72\",\n" +
                "      \"Species\":\"Iron Will Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cofagrigus\":{\n" +
                "      \"#\":\"563\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"145\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"58\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Coffin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"483\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Combee\":{\n" +
                "      \"#\":\"415\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"42\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"42\",\n" +
                "      \"Species\":\"Tiny Bee Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"244\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Combusken\":{\n" +
                "      \"#\":\"256\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Young Fowl Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Conkeldurr\":{\n" +
                "      \"#\":\"534\",\n" +
                "      \"Attack\":\"140\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"Rather than rely on force, they master moves that utilize the centrifugal force of spinning concrete.\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Muscular Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Corphish\":{\n" +
                "      \"#\":\"341\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"43\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Ruffian Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"308\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Corsola\":{\n" +
                "      \"#\":\"222\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Coral Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"380\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cottonee\":{\n" +
                "      \"#\":\"546\",\n" +
                "      \"Attack\":\"27\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"37\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Cotton Puff Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"66\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cradily\":{\n" +
                "      \"#\":\"346\",\n" +
                "      \"Attack\":\"81\",\n" +
                "      \"Defense\":\"97\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"86\",\n" +
                "      \"Sp. Atk\":\"81\",\n" +
                "      \"Sp. Def\":\"107\",\n" +
                "      \"Species\":\"Barnacle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"43\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cranidos\":{\n" +
                "      \"#\":\"408\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"67\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Head Butt Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Crawdaunt\":{\n" +
                "      \"#\":\"342\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"63\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Rogue Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"468\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cresselia\":{\n" +
                "      \"#\":\"488\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"120\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"Lunar Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Croagunk\":{\n" +
                "      \"#\":\"453\",\n" +
                "      \"Attack\":\"61\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"48\",\n" +
                "      \"Sp. Atk\":\"61\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Toxic Mouth Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Crobat\":{\n" +
                "      \"#\":\"169\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Bat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"130\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Croconaw\":{\n" +
                "      \"#\":\"159\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"59\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Big Jaw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Crustle\":{\n" +
                "      \"#\":\"558\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"125\",\n" +
                "      \"FlavorText\":\"Competing for territory, Crustle fight viciously. The one whose boulder is broken is the loser of the battle.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Stone Home Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cryogonal\":{\n" +
                "      \"#\":\"615\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"135\",\n" +
                "      \"Species\":\"Crystallizing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cubchoo\":{\n" +
                "      \"#\":\"613\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Chill Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cubone\":{\n" +
                "      \"#\":\"104\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Lonely Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Cyndaquil\":{\n" +
                "      \"#\":\"155\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"43\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"39\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Fire Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"309\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Darkrai\":{\n" +
                "      \"#\":\"491\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Pitch-Black Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"125\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Darmanitan ( Standard  Mode )\":{\n" +
                "      \"#\":\"555\",\n" +
                "      \"Attack\":\"140\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Darmanitan ( Zen  Mode )\":{\n" +
                "      \"#\":\"555\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"140\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Darumaka\":{\n" +
                "      \"#\":\"554\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"15\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Zen Charm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"315\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dedenne\":{\n" +
                "      \"#\":\"702\",\n" +
                "      \"Attack\":\"58\",\n" +
                "      \"Defense\":\"57\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"67\",\n" +
                "      \"Sp. Atk\":\"81\",\n" +
                "      \"Sp. Def\":\"67\",\n" +
                "      \"Species\":\"Antenna Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"431\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Deerling\":{\n" +
                "      \"#\":\"585\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Season Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Deino\":{\n" +
                "      \"#\":\"633\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"52\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Irate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"38\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Delcatty\":{\n" +
                "      \"#\":\"301\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Prim Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"380\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Delibird\":{\n" +
                "      \"#\":\"225\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Delivery Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Delphox\":{\n" +
                "      \"#\":\"655\",\n" +
                "      \"Attack\":\"69\",\n" +
                "      \"Defense\":\"72\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"114\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"104\",\n" +
                "      \"Total\":\"534\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Deoxys ( Attack  Forme )\":{\n" +
                "      \"#\":\"386\",\n" +
                "      \"Attack\":\"180\",\n" +
                "      \"Defense\":\"20\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"180\",\n" +
                "      \"Sp. Def\":\"20\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"150\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Deoxys ( Defense  Forme )\":{\n" +
                "      \"#\":\"386\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"160\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"160\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Deoxys ( Normal  Forme )\":{\n" +
                "      \"#\":\"386\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"150\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Deoxys ( Speed  Forme )\":{\n" +
                "      \"#\":\"386\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"180\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dewgong\":{\n" +
                "      \"#\":\"087\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Sea Lion Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dewott\":{\n" +
                "      \"#\":\"502\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Discipline Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"413\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dialga\":{\n" +
                "      \"#\":\"483\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Temporal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Diancie\":{\n" +
                "      \"#\":\"719\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"Jewel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Diancie ( Mega  Diancie )\":{\n" +
                "      \"#\":\"719\",\n" +
                "      \"Attack\":\"160\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"160\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Diggersby\":{\n" +
                "      \"#\":\"660\",\n" +
                "      \"Attack\":\"56\",\n" +
                "      \"Defense\":\"77\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"77\",\n" +
                "      \"Species\":\"Digging Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"78\",\n" +
                "      \"Total\":\"423\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Diglett\":{\n" +
                "      \"#\":\"050\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"25\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"10\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Mole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"265\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ditto\":{\n" +
                "      \"#\":\"132\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"48\",\n" +
                "      \"Sp. Atk\":\"48\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Transform Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"48\",\n" +
                "      \"Total\":\"288\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dodrio\":{\n" +
                "      \"#\":\"085\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Triple Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Doduo\":{\n" +
                "      \"#\":\"084\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Twin Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Donphan\":{\n" +
                "      \"#\":\"232\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Doublade\":{\n" +
                "      \"#\":\"680\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"59\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"49\",\n" +
                "      \"Species\":\"Sword Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"448\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dragalge\":{\n" +
                "      \"#\":\"691\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"97\",\n" +
                "      \"Sp. Def\":\"123\",\n" +
                "      \"Species\":\"Mock Kelp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"44\",\n" +
                "      \"Total\":\"494\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dragonair\":{\n" +
                "      \"#\":\"148\",\n" +
                "      \"Attack\":\"84\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"It is called the divine POK\\u00e9MON. When its entire body brightens slightly, the weather changes.\",\n" +
                "      \"HP\":\"61\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dragonite\":{\n" +
                "      \"#\":\"149\",\n" +
                "      \"Attack\":\"134\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"It is said that somewhere in the ocean lies an island where these gather. Only they live there.\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Drapion\":{\n" +
                "      \"#\":\"452\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Ogre Scorp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dratini\":{\n" +
                "      \"#\":\"147\",\n" +
                "      \"Attack\":\"64\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"It sheds many layers of skin as it grows larger. During this process, it is protected by a rapid waterfall.\",\n" +
                "      \"HP\":\"41\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Drifblim\":{\n" +
                "      \"#\":\"426\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"44\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"150\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"54\",\n" +
                "      \"Species\":\"Blimp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"498\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Drifloon\":{\n" +
                "      \"#\":\"425\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"34\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"44\",\n" +
                "      \"Species\":\"Balloon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"348\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Drilbur\":{\n" +
                "      \"#\":\"529\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Mole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"68\",\n" +
                "      \"Total\":\"328\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Drowzee\":{\n" +
                "      \"#\":\"096\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"When it twitches its nose, it can tell where someone is sleeping and what that person is dreaming about.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"43\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Hypnosis Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"42\",\n" +
                "      \"Total\":\"328\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Druddigon\":{\n" +
                "      \"#\":\"621\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"It warms its body by absorbing sunlight with its wings. When its body temperature falls, it can no longer move.\",\n" +
                "      \"HP\":\"77\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Cave Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"48\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ducklett\":{\n" +
                "      \"#\":\"580\",\n" +
                "      \"Attack\":\"44\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"They are better at swimming than flying, and they happily eat their favorite food, peat moss, as they dive underwater.\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Water Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dugtrio\":{\n" +
                "      \"#\":\"051\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Mole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"120\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dunsparce\":{\n" +
                "      \"#\":\"206\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Land Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"415\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Duosion\":{\n" +
                "      \"#\":\"578\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"When their two divided brains think the same thoughts, their psychic power is maximized.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Mitosis Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"370\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Durant\":{\n" +
                "      \"#\":\"632\",\n" +
                "      \"Attack\":\"109\",\n" +
                "      \"Defense\":\"112\",\n" +
                "      \"FlavorText\":\"They attack in groups, covering themselves in steel armor to protect themselves from Heatmor.\",\n" +
                "      \"HP\":\"58\",\n" +
                "      \"Sp. Atk\":\"48\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Iron Ant Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"109\",\n" +
                "      \"Total\":\"484\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dusclops\":{\n" +
                "      \"#\":\"356\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"Beckon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dusknoir\":{\n" +
                "      \"#\":\"477\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"135\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"135\",\n" +
                "      \"Species\":\"Gripper Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Duskull\":{\n" +
                "      \"#\":\"355\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"20\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Requiem Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"295\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dustox\":{\n" +
                "      \"#\":\"269\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"Toxic powder is scattered with each flap. At night, it is known to strip leaves off trees lining boulevards.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Poison Moth Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"385\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Dwebble\":{\n" +
                "      \"#\":\"557\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"When it finds a stone of a suitable size, it secretes a liquid from its mouth to open up a hole to crawl into.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Rock Inn Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Eelektrik\":{\n" +
                "      \"#\":\"603\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"EleFish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Eelektross\":{\n" +
                "      \"#\":\"604\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"EleFish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Eevee\":{\n" +
                "      \"#\":\"133\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Evolution Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ekans\":{\n" +
                "      \"#\":\"023\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"44\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"54\",\n" +
                "      \"Species\":\"Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"288\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Electabuzz\":{\n" +
                "      \"#\":\"125\",\n" +
                "      \"Attack\":\"83\",\n" +
                "      \"Defense\":\"57\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Electric Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Electivire\":{\n" +
                "      \"#\":\"466\",\n" +
                "      \"Attack\":\"123\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Thunderbolt Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Electrike\":{\n" +
                "      \"#\":\"309\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"It generates electricity using friction from the atmosphere. In seasons with especially arid air, its entire body blazes with violent showers of sparks.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Lightning Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"295\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Electrode\":{\n" +
                "      \"#\":\"101\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Ball Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"140\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Elekid\":{\n" +
                "      \"#\":\"239\",\n" +
                "      \"Attack\":\"63\",\n" +
                "      \"Defense\":\"37\",\n" +
                "      \"FlavorText\":\"If it touches metal and discharges the electricity it has stored in its body, an ELEKID begins swinging its arms in circles to recharge itself.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Electric Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"360\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Elgyem\":{\n" +
                "      \"#\":\"605\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Cerebral Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Emboar\":{\n" +
                "      \"#\":\"500\",\n" +
                "      \"Attack\":\"123\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Mega Fire Pig Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"528\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Emolga\":{\n" +
                "      \"#\":\"587\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Sky Squirrel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"103\",\n" +
                "      \"Total\":\"428\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Empoleon\":{\n" +
                "      \"#\":\"395\",\n" +
                "      \"Attack\":\"86\",\n" +
                "      \"Defense\":\"88\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"84\",\n" +
                "      \"Sp. Atk\":\"111\",\n" +
                "      \"Sp. Def\":\"101\",\n" +
                "      \"Species\":\"Emperor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Entei\":{\n" +
                "      \"#\":\"244\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"115\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Volcano Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Escavalier\":{\n" +
                "      \"#\":\"589\",\n" +
                "      \"Attack\":\"135\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"These Pok\\u00e9mon evolve by wearing the shell covering of a Shelmet. The steel armor protects their whole body.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Cavalry Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Espeon\":{\n" +
                "      \"#\":\"196\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Sun Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Espurr\":{\n" +
                "      \"#\":\"677\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"54\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"63\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Restraint Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"68\",\n" +
                "      \"Total\":\"355\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Excadrill\":{\n" +
                "      \"#\":\"530\",\n" +
                "      \"Attack\":\"135\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Subterrene Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"88\",\n" +
                "      \"Total\":\"508\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Exeggcute\":{\n" +
                "      \"#\":\"102\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"If even one is separated from the group, the energy bond between the six will make them rejoin instantly.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Egg Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Exeggutor\":{\n" +
                "      \"#\":\"103\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"Living in a good environment makes it grow lots of heads. A head that drops off becomes an EXEGGCUTE.\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Coconut Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Exploud\":{\n" +
                "      \"#\":\"295\",\n" +
                "      \"Attack\":\"91\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"104\",\n" +
                "      \"Sp. Atk\":\"91\",\n" +
                "      \"Sp. Def\":\"73\",\n" +
                "      \"Species\":\"Loud Noise Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"68\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Farfetch'd\":{\n" +
                "      \"#\":\"083\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"52\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"62\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"352\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Fearow\":{\n" +
                "      \"#\":\"022\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"It uses its long beak to attack. It has a surprisingly long reach, so it must be treated with caution.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"61\",\n" +
                "      \"Sp. Def\":\"61\",\n" +
                "      \"Species\":\"Beak Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"442\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Feebas\":{\n" +
                "      \"#\":\"349\",\n" +
                "      \"Attack\":\"15\",\n" +
                "      \"Defense\":\"20\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"20\",\n" +
                "      \"Sp. Atk\":\"10\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"200\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Fennekin\":{\n" +
                "      \"#\":\"653\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"62\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"307\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Feraligatr\":{\n" +
                "      \"#\":\"160\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"79\",\n" +
                "      \"Sp. Def\":\"83\",\n" +
                "      \"Species\":\"Big Jaw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"78\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ferroseed\":{\n" +
                "      \"#\":\"597\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"91\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"24\",\n" +
                "      \"Sp. Def\":\"86\",\n" +
                "      \"Species\":\"Thorn Seed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"10\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ferrothorn\":{\n" +
                "      \"#\":\"598\",\n" +
                "      \"Attack\":\"94\",\n" +
                "      \"Defense\":\"131\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"74\",\n" +
                "      \"Sp. Atk\":\"54\",\n" +
                "      \"Sp. Def\":\"116\",\n" +
                "      \"Species\":\"Thorn Pod Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"489\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Finneon\":{\n" +
                "      \"#\":\"456\",\n" +
                "      \"Attack\":\"49\",\n" +
                "      \"Defense\":\"56\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"49\",\n" +
                "      \"Sp. Atk\":\"49\",\n" +
                "      \"Sp. Def\":\"61\",\n" +
                "      \"Species\":\"Wing Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"66\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Flaaffy\":{\n" +
                "      \"#\":\"180\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"Its fleece quality changes to generate strong static electricity with a small amount of wool. The bare, slick parts of its hide are shielded against electricity.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Wool Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"365\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Flab\\u00e9b\\u00e9\":{\n" +
                "      \"#\":\"669\",\n" +
                "      \"Attack\":\"38\",\n" +
                "      \"Defense\":\"39\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"61\",\n" +
                "      \"Sp. Def\":\"79\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"42\",\n" +
                "      \"Total\":\"303\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Flareon\":{\n" +
                "      \"#\":\"136\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Flame Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Fletchinder\":{\n" +
                "      \"#\":\"662\",\n" +
                "      \"Attack\":\"73\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"56\",\n" +
                "      \"Sp. Def\":\"52\",\n" +
                "      \"Species\":\"Ember Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"84\",\n" +
                "      \"Total\":\"382\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Fletchling\":{\n" +
                "      \"#\":\"661\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"43\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"38\",\n" +
                "      \"Species\":\"Tiny Robin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"62\",\n" +
                "      \"Total\":\"278\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Floatzel\":{\n" +
                "      \"#\":\"419\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Sea Weasel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Floette\":{\n" +
                "      \"#\":\"670\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"47\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"54\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"98\",\n" +
                "      \"Species\":\"Single Bloom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"52\",\n" +
                "      \"Total\":\"371\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Florges\":{\n" +
                "      \"#\":\"671\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"68\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"112\",\n" +
                "      \"Sp. Def\":\"154\",\n" +
                "      \"Species\":\"Garden Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"552\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Flygon\":{\n" +
                "      \"#\":\"330\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Mystic Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Foongus\":{\n" +
                "      \"#\":\"590\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"69\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Mushroom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"294\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Forretress\":{\n" +
                "      \"#\":\"205\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"140\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Bagworm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Fraxure\":{\n" +
                "      \"#\":\"611\",\n" +
                "      \"Attack\":\"117\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"A broken tusk will not grow back, so it diligently sharpens its tusks on river rocks after the end of a battle.\",\n" +
                "      \"HP\":\"66\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Axe Jaw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"67\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Frillish\":{\n" +
                "      \"#\":\"592\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Floating Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Froakie\":{\n" +
                "      \"#\":\"656\",\n" +
                "      \"Attack\":\"56\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"41\",\n" +
                "      \"Sp. Atk\":\"62\",\n" +
                "      \"Sp. Def\":\"44\",\n" +
                "      \"Species\":\"Bubble Frog Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"71\",\n" +
                "      \"Total\":\"314\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Frogadier\":{\n" +
                "      \"#\":\"657\",\n" +
                "      \"Attack\":\"63\",\n" +
                "      \"Defense\":\"52\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"54\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Bubble Frog Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"97\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Froslass\":{\n" +
                "      \"#\":\"478\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Snow Land Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Furfrou\":{\n" +
                "      \"#\":\"676\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Poodle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"102\",\n" +
                "      \"Total\":\"472\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Furret\":{\n" +
                "      \"#\":\"162\",\n" +
                "      \"Attack\":\"76\",\n" +
                "      \"Defense\":\"64\",\n" +
                "      \"FlavorText\":\"A FURRET has a very slim build. When under attack, it can squirm through narrow spaces and get away. In spite of its short limbs, it is very nimble and fleet.\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Long Body Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"415\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gabite\":{\n" +
                "      \"#\":\"444\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Cave Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"82\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gallade\":{\n" +
                "      \"#\":\"475\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"Blade Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"518\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gallade ( Mega  Gallade )\":{\n" +
                "      \"#\":\"475\",\n" +
                "      \"Attack\":\"165\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"618\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Galvantula\":{\n" +
                "      \"#\":\"596\",\n" +
                "      \"Attack\":\"77\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"97\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"EleSpider Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"472\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Garbodor\":{\n" +
                "      \"#\":\"569\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"82\",\n" +
                "      \"FlavorText\":\"Consuming garbage makes new kinds of poison gases and liquids inside their bodies.\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"82\",\n" +
                "      \"Species\":\"Trash Heap Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"474\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Garchomp\":{\n" +
                "      \"#\":\"445\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"108\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Mach Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"102\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Garchomp ( Mega  Garchomp )\":{\n" +
                "      \"#\":\"445\",\n" +
                "      \"Attack\":\"170\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"108\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"92\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gardevoir\":{\n" +
                "      \"#\":\"282\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"Embrace Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"518\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gardevoir ( Mega  Gardevoir )\":{\n" +
                "      \"#\":\"282\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"165\",\n" +
                "      \"Sp. Def\":\"135\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"618\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gastly\":{\n" +
                "      \"#\":\"092\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Gas Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gastrodon\":{\n" +
                "      \"#\":\"423\",\n" +
                "      \"Attack\":\"83\",\n" +
                "      \"Defense\":\"68\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"111\",\n" +
                "      \"Sp. Atk\":\"92\",\n" +
                "      \"Sp. Def\":\"82\",\n" +
                "      \"Species\":\"Sea Slug Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"39\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Genesect\":{\n" +
                "      \"#\":\"649\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"71\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Paleozoic Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"99\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gengar\":{\n" +
                "      \"#\":\"094\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Shadow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gengar ( Mega  Gengar )\":{\n" +
                "      \"#\":\"094\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"170\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"130\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Geodude\":{\n" +
                "      \"#\":\"074\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Rock Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gible\":{\n" +
                "      \"#\":\"443\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"58\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Land Shark Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"42\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gigalith\":{\n" +
                "      \"#\":\"526\",\n" +
                "      \"Attack\":\"135\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Compressed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Girafarig\":{\n" +
                "      \"#\":\"203\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Long Neck Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Giratina ( Altered  Forme )\":{\n" +
                "      \"#\":\"487\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"150\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Giratina ( Origin  Forme )\":{\n" +
                "      \"#\":\"487\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"150\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Glaceon\":{\n" +
                "      \"#\":\"471\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Fresh Snow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Glalie\":{\n" +
                "      \"#\":\"362\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Face Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Glalie ( Mega  Glalie )\":{\n" +
                "      \"#\":\"362\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Glameow\":{\n" +
                "      \"#\":\"431\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"42\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"49\",\n" +
                "      \"Sp. Atk\":\"42\",\n" +
                "      \"Sp. Def\":\"37\",\n" +
                "      \"Species\":\"Catty Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gligar\":{\n" +
                "      \"#\":\"207\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"FlyScorpion Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gliscor\":{\n" +
                "      \"#\":\"472\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"125\",\n" +
                "      \"FlavorText\":\"If it succeeds in catching even a faint breeze properly, it can circle the globe without flapping once.\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Fang Scorp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gloom\":{\n" +
                "      \"#\":\"044\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Weed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"395\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gogoat\":{\n" +
                "      \"#\":\"673\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"123\",\n" +
                "      \"Sp. Atk\":\"97\",\n" +
                "      \"Sp. Def\":\"81\",\n" +
                "      \"Species\":\"Mount Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"68\",\n" +
                "      \"Total\":\"531\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Golbat\":{\n" +
                "      \"#\":\"042\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Bat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Goldeen\":{\n" +
                "      \"#\":\"118\",\n" +
                "      \"Attack\":\"67\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Goldfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"63\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Golduck\":{\n" +
                "      \"#\":\"055\",\n" +
                "      \"Attack\":\"82\",\n" +
                "      \"Defense\":\"78\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Duck Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Golem\":{\n" +
                "      \"#\":\"076\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Megaton Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Golett\":{\n" +
                "      \"#\":\"622\",\n" +
                "      \"Attack\":\"74\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"Ancient science fashioned this Pok\\u00e9mon from clay. It\\u2019s been active for thousands of years.\",\n" +
                "      \"HP\":\"59\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Automaton Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"303\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Golurk\":{\n" +
                "      \"#\":\"623\",\n" +
                "      \"Attack\":\"124\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"It flies across the sky at Mach speeds. Removing the seal on its chest makes its internal energy go out of control.\",\n" +
                "      \"HP\":\"89\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Automaton Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"483\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Goodra\":{\n" +
                "      \"#\":\"706\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Goomy\":{\n" +
                "      \"#\":\"704\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Soft Tissue Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gorebyss\":{\n" +
                "      \"#\":\"368\",\n" +
                "      \"Attack\":\"84\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"114\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"South Sea Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"52\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gothita\":{\n" +
                "      \"#\":\"574\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"They intently observe both Trainers and Pok\\u00e9mon. Apparently, they are looking at something that only Gothita can see.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Fixation Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gothitelle\":{\n" +
                "      \"#\":\"576\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"They can predict the future from the placement and movement of the stars. They can see Trainers\\u2019 life spans.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Astral Body Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gothorita\":{\n" +
                "      \"#\":\"575\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"According to many old tales, it creates friends for itself by controlling sleeping children on starry nights.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Manipulate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gourgeist ( Average  Size )\":{\n" +
                "      \"#\":\"711\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"122\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"84\",\n" +
                "      \"Total\":\"494\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gourgeist ( Large  Size )\":{\n" +
                "      \"#\":\"711\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"122\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"69\",\n" +
                "      \"Total\":\"494\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gourgeist ( Small  Size )\":{\n" +
                "      \"#\":\"711\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"122\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"99\",\n" +
                "      \"Total\":\"494\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gourgeist ( Super  Size )\":{\n" +
                "      \"#\":\"711\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"122\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"58\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"54\",\n" +
                "      \"Total\":\"494\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Granbull\":{\n" +
                "      \"#\":\"210\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"It has a particularly well-developed lower jaw. The huge fangs are heavy, causing it to tilt its head. Unless it is startled, it will not try to bite.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Fairy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Graveler\":{\n" +
                "      \"#\":\"075\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Rock Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Greninja\":{\n" +
                "      \"#\":\"658\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"72\",\n" +
                "      \"Sp. Atk\":\"103\",\n" +
                "      \"Sp. Def\":\"71\",\n" +
                "      \"Species\":\"Ninja Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"122\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Grimer\":{\n" +
                "      \"#\":\"088\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Sludge Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Grotle\":{\n" +
                "      \"#\":\"388\",\n" +
                "      \"Attack\":\"89\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Grove Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"36\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Groudon\":{\n" +
                "      \"#\":\"383\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"140\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Continent Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"670\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Groudon ( Primal  Groudon )\":{\n" +
                "      \"#\":\"383\",\n" +
                "      \"Attack\":\"180\",\n" +
                "      \"Defense\":\"160\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"770\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Grovyle\":{\n" +
                "      \"#\":\"253\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Wood Gecko Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Growlithe\":{\n" +
                "      \"#\":\"058\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Puppy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Grumpig\":{\n" +
                "      \"#\":\"326\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Manipulate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"470\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gulpin\":{\n" +
                "      \"#\":\"316\",\n" +
                "      \"Attack\":\"43\",\n" +
                "      \"Defense\":\"53\",\n" +
                "      \"FlavorText\":\"This POK\\u00e9MON\\u2019s stomach fluid can even digest scrap iron. In one gulp, it can swallow something that is as large as itself.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"43\",\n" +
                "      \"Sp. Def\":\"53\",\n" +
                "      \"Species\":\"Stomach Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"302\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gurdurr\":{\n" +
                "      \"#\":\"533\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"This Pok\\u00e9mon is so muscular and strongly built that even a group of wrestlers could not make it budge an inch.\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Muscular Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gyarados\":{\n" +
                "      \"#\":\"130\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"79\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Atrocious Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"81\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Gyarados ( Mega  Gyarados )\":{\n" +
                "      \"#\":\"130\",\n" +
                "      \"Attack\":\"155\",\n" +
                "      \"Defense\":\"109\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"81\",\n" +
                "      \"Total\":\"640\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Happiny\":{\n" +
                "      \"#\":\"440\",\n" +
                "      \"Attack\":\"5\",\n" +
                "      \"Defense\":\"5\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"15\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Playhouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"220\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hariyama\":{\n" +
                "      \"#\":\"297\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"It has the habit of challenging others without hesitation to tests of strength. It\\u2019s been known to stand on train tracks and stop trains using forearm thrusts.\",\n" +
                "      \"HP\":\"144\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Arm Thrust Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"474\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Haunter\":{\n" +
                "      \"#\":\"093\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Gas Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hawlucha\":{\n" +
                "      \"#\":\"701\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"74\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Wrestling Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"118\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Haxorus\":{\n" +
                "      \"#\":\"612\",\n" +
                "      \"Attack\":\"147\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"Their sturdy tusks will stay sharp even if used to cut steel beams. These Pok\\u00e9mon are covered in hard armor.\",\n" +
                "      \"HP\":\"76\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Axe Jaw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"97\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Heatmor\":{\n" +
                "      \"#\":\"631\",\n" +
                "      \"Attack\":\"97\",\n" +
                "      \"Defense\":\"66\",\n" +
                "      \"FlavorText\":\"It draws in air through its tail, transforms it into fire, and uses it like a tongue. It melts Durant and eats them.\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"66\",\n" +
                "      \"Species\":\"Anteater Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"484\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Heatran\":{\n" +
                "      \"#\":\"485\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"106\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"106\",\n" +
                "      \"Species\":\"Lava Dome Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"77\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Heliolisk\":{\n" +
                "      \"#\":\"695\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"52\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"109\",\n" +
                "      \"Sp. Def\":\"94\",\n" +
                "      \"Species\":\"Generator Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"109\",\n" +
                "      \"Total\":\"481\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Helioptile\":{\n" +
                "      \"#\":\"694\",\n" +
                "      \"Attack\":\"38\",\n" +
                "      \"Defense\":\"33\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"61\",\n" +
                "      \"Sp. Def\":\"43\",\n" +
                "      \"Species\":\"Generator Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"289\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Heracross\":{\n" +
                "      \"#\":\"214\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Single Horn Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Heracross ( Mega  Heracross )\":{\n" +
                "      \"#\":\"214\",\n" +
                "      \"Attack\":\"185\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Herdier\":{\n" +
                "      \"#\":\"507\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Loyal Dog Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"370\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hippopotas\":{\n" +
                "      \"#\":\"449\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"78\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"38\",\n" +
                "      \"Sp. Def\":\"42\",\n" +
                "      \"Species\":\"Hippo Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"32\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hippowdon\":{\n" +
                "      \"#\":\"450\",\n" +
                "      \"Attack\":\"112\",\n" +
                "      \"Defense\":\"118\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"108\",\n" +
                "      \"Sp. Atk\":\"68\",\n" +
                "      \"Sp. Def\":\"72\",\n" +
                "      \"Species\":\"Heavyweight Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"47\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hitmonchan\":{\n" +
                "      \"#\":\"107\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"79\",\n" +
                "      \"FlavorText\":\"To increase the strength of all its punch moves, it spins its arms just before making contact.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Punching Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"76\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hitmonlee\":{\n" +
                "      \"#\":\"106\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"53\",\n" +
                "      \"FlavorText\":\"It is also called the Kick Master. It uses its elastic legs to execute every known kick.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Kicking Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"87\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hitmontop\":{\n" +
                "      \"#\":\"237\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Handstand Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ho-oh\":{\n" +
                "      \"#\":\"250\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"106\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"154\",\n" +
                "      \"Species\":\"Rainbow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Honchkrow\":{\n" +
                "      \"#\":\"430\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"52\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"52\",\n" +
                "      \"Species\":\"Big Boss Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"71\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Honedge\":{\n" +
                "      \"#\":\"679\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"37\",\n" +
                "      \"Species\":\"Sword Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"28\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hoopa ( Hoopa  Confined )\":{\n" +
                "      \"#\":\"720\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hoopa ( Hoopa  Unbound )\":{\n" +
                "      \"#\":\"720\",\n" +
                "      \"Attack\":\"160\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"170\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hoothoot\":{\n" +
                "      \"#\":\"163\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"36\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Owl Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"262\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hoppip\":{\n" +
                "      \"#\":\"187\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"This POK\\u00e9MON drifts and floats with the wind. If it senses the approach of strong winds, a HOPPIP links leaves with others to prepare against being blown away.\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Cottonweed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Horsea\":{\n" +
                "      \"#\":\"116\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"295\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Houndoom\":{\n" +
                "      \"#\":\"229\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Dark Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Houndoom ( Mega  Houndoom )\":{\n" +
                "      \"#\":\"229\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"140\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Houndour\":{\n" +
                "      \"#\":\"228\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Dark Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Huntail\":{\n" +
                "      \"#\":\"367\",\n" +
                "      \"Attack\":\"104\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"94\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Deep Sea Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"52\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hydreigon\":{\n" +
                "      \"#\":\"635\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"92\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Brutal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"98\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Hypno\":{\n" +
                "      \"#\":\"097\",\n" +
                "      \"Attack\":\"73\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"The longer it swings its pendulum, the longer the effects of its hypnosis last.\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"73\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"Hypnosis Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"67\",\n" +
                "      \"Total\":\"483\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Igglybuff\":{\n" +
                "      \"#\":\"174\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"15\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"20\",\n" +
                "      \"Species\":\"Balloon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"210\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Illumise\":{\n" +
                "      \"#\":\"314\",\n" +
                "      \"Attack\":\"47\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"A nocturnal POK\\u00e9MON that becomes active upon nightfall. It leads a VOLBEAT swarm to draw patterns in the night sky. Over 200 different patterns have been confirmed.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"73\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Firefly Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"400\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Infernape\":{\n" +
                "      \"#\":\"392\",\n" +
                "      \"Attack\":\"104\",\n" +
                "      \"Defense\":\"71\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"76\",\n" +
                "      \"Sp. Atk\":\"104\",\n" +
                "      \"Sp. Def\":\"71\",\n" +
                "      \"Species\":\"Flame Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"534\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Inkay\":{\n" +
                "      \"#\":\"686\",\n" +
                "      \"Attack\":\"54\",\n" +
                "      \"Defense\":\"53\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"53\",\n" +
                "      \"Sp. Atk\":\"37\",\n" +
                "      \"Sp. Def\":\"46\",\n" +
                "      \"Species\":\"Revolving Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"288\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ivysaur\":{\n" +
                "      \"#\":\"002\",\n" +
                "      \"Attack\":\"62\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"The bulb on its back grows as it absorbs nutrients. The bulb gives off a pleasant aroma when it blooms.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Seed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Jellicent\":{\n" +
                "      \"#\":\"593\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Floating Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Jigglypuff\":{\n" +
                "      \"#\":\"039\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"20\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"115\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Balloon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"270\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Jirachi\":{\n" +
                "      \"#\":\"385\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Wish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Jolteon\":{\n" +
                "      \"#\":\"135\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Lightning Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"130\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Joltik\":{\n" +
                "      \"#\":\"595\",\n" +
                "      \"Attack\":\"47\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"57\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Attaching Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"319\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Jumpluff\":{\n" +
                "      \"#\":\"189\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"JUMPLUFF ride warm southern winds to cross the sea and fly to foreign lands. This POK\\u00e9MON lands when it encounters cold air while it is floating.\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Cottonweed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Jynx\":{\n" +
                "      \"#\":\"124\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Human Shape Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kabuto\":{\n" +
                "      \"#\":\"140\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"Three hundred million years ago, it hid on the sea floor. It also has eyes on its back that glow.\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Shellfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"355\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kabutops\":{\n" +
                "      \"#\":\"141\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"It was able to swim quickly through the water by compactly folding up its razor-sharp sickles.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Shellfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kadabra\":{\n" +
                "      \"#\":\"064\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Psi Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"400\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kakuna\":{\n" +
                "      \"#\":\"014\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Cocoon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"205\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kangaskhan\":{\n" +
                "      \"#\":\"115\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Parent Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kangaskhan ( Mega  Kangaskhan )\":{\n" +
                "      \"#\":\"115\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"590\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Karrablast\":{\n" +
                "      \"#\":\"588\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"For some reason they evolve when they receive electrical energy while they are attacking Shelmet.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Clamping Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"315\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kecleon\":{\n" +
                "      \"#\":\"352\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Color Swap Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Keldeo ( Ordinary  Forme )\":{\n" +
                "      \"#\":\"647\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"129\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Keldeo ( Resolute  Forme )\":{\n" +
                "      \"#\":\"647\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"129\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kingdra\":{\n" +
                "      \"#\":\"230\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kingler\":{\n" +
                "      \"#\":\"099\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"Its oversized claw is very powerful, but when it's not in battle, the claw just gets in the way.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Pincer Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kirlia\":{\n" +
                "      \"#\":\"281\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"38\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Emotion Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"278\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Klang\":{\n" +
                "      \"#\":\"600\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Gear Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Klefki\":{\n" +
                "      \"#\":\"707\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"91\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"57\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"87\",\n" +
                "      \"Species\":\"Key Ring Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"470\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Klink\":{\n" +
                "      \"#\":\"599\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Gear Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Klinklang\":{\n" +
                "      \"#\":\"601\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Gear Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Koffing\":{\n" +
                "      \"#\":\"109\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Poison Gas Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Krabby\":{\n" +
                "      \"#\":\"098\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"If it is unable to find food, it will absorb nutrients by swallowing a mouthful of sand.\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"River Crab Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kricketot\":{\n" +
                "      \"#\":\"401\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"41\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"37\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"41\",\n" +
                "      \"Species\":\"Cricket Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"194\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kricketune\":{\n" +
                "      \"#\":\"402\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"51\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"77\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"51\",\n" +
                "      \"Species\":\"Cricket Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"384\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Krokorok\":{\n" +
                "      \"#\":\"552\",\n" +
                "      \"Attack\":\"82\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"The special membrane covering its eyes can sense the heat of objects, so it can see its surroundings even in darkness.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Desert Croc Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"74\",\n" +
                "      \"Total\":\"351\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Krookodile\":{\n" +
                "      \"#\":\"553\",\n" +
                "      \"Attack\":\"117\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"They never allow prey to escape. Their jaws are so powerful, they can crush the body of an automobile.\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Intimidation Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"92\",\n" +
                "      \"Total\":\"519\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kyogre\":{\n" +
                "      \"#\":\"382\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"140\",\n" +
                "      \"Species\":\"Sea Basin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"670\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kyogre ( Primal  Kyogre )\":{\n" +
                "      \"#\":\"382\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"180\",\n" +
                "      \"Sp. Def\":\"160\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"770\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kyurem\":{\n" +
                "      \"#\":\"646\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"125\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Boundary Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"660\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kyurem ( Black  Kyurem )\":{\n" +
                "      \"#\":\"646\",\n" +
                "      \"Attack\":\"170\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"125\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Kyurem ( White  Kyurem )\":{\n" +
                "      \"#\":\"646\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"125\",\n" +
                "      \"Sp. Atk\":\"170\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lairon\":{\n" +
                "      \"#\":\"305\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"140\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Iron Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lampent\":{\n" +
                "      \"#\":\"608\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"It arrives near the moment of death and steals spirit from the body.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Lamp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"370\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Landorus ( Incarnate  Forme )\":{\n" +
                "      \"#\":\"645\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"89\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Landorus ( Therian  Forme )\":{\n" +
                "      \"#\":\"645\",\n" +
                "      \"Attack\":\"145\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"89\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"91\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lanturn\":{\n" +
                "      \"#\":\"171\",\n" +
                "      \"Attack\":\"58\",\n" +
                "      \"Defense\":\"58\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"125\",\n" +
                "      \"Sp. Atk\":\"76\",\n" +
                "      \"Sp. Def\":\"76\",\n" +
                "      \"Species\":\"Light Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"67\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lapras\":{\n" +
                "      \"#\":\"131\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"130\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Transport Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Larvesta\":{\n" +
                "      \"#\":\"636\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Torch Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"360\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Larvitar\":{\n" +
                "      \"#\":\"246\",\n" +
                "      \"Attack\":\"64\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"A LARVITAR is born deep under the ground. It must eat its way through the soil above and reach the surface for it to see its parents\\u2019 faces.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Rock Skin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"41\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Latias\":{\n" +
                "      \"#\":\"380\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"Eon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Latias ( Mega  Latias )\":{\n" +
                "      \"#\":\"380\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"140\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Latios\":{\n" +
                "      \"#\":\"381\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Eon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Latios ( Mega  Latios )\":{\n" +
                "      \"#\":\"381\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"160\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Leafeon\":{\n" +
                "      \"#\":\"470\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Verdant Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Leavanny\":{\n" +
                "      \"#\":\"542\",\n" +
                "      \"Attack\":\"103\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Nurturing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"92\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ledian\":{\n" +
                "      \"#\":\"166\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"It is said that in lands with clean air, where the stars fill the sky, there live many LEDIAN. For good reason, they use the light of the stars as energy.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Five Star Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ledyba\":{\n" +
                "      \"#\":\"165\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"LEDYBA communicate using a fluid that they secrete from where the legs join the body. They are said to convey feelings to others by altering the fluid\\u2019s scent.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Five Star Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"265\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lickilicky\":{\n" +
                "      \"#\":\"463\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Licking Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lickitung\":{\n" +
                "      \"#\":\"108\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Licking Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"385\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Liepard\":{\n" +
                "      \"#\":\"510\",\n" +
                "      \"Attack\":\"88\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"Stealthily, it sneaks up on its target, striking from behind before its victim has a chance to react.\",\n" +
                "      \"HP\":\"64\",\n" +
                "      \"Sp. Atk\":\"88\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Cruel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"106\",\n" +
                "      \"Total\":\"446\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lileep\":{\n" +
                "      \"#\":\"345\",\n" +
                "      \"Attack\":\"41\",\n" +
                "      \"Defense\":\"77\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"66\",\n" +
                "      \"Sp. Atk\":\"61\",\n" +
                "      \"Sp. Def\":\"87\",\n" +
                "      \"Species\":\"Sea Lily Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"23\",\n" +
                "      \"Total\":\"355\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lilligant\":{\n" +
                "      \"#\":\"549\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Flowering Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lillipup\":{\n" +
                "      \"#\":\"506\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Puppy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"275\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Linoone\":{\n" +
                "      \"#\":\"264\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"61\",\n" +
                "      \"FlavorText\":\"It is exceedingly fast if it only has to run in a straight line. When it spots pond-dwelling prey underwater, it quickly leaps in and catches it with its sharp claws.\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"61\",\n" +
                "      \"Species\":\"Rushing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Litleo\":{\n" +
                "      \"#\":\"667\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"58\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"73\",\n" +
                "      \"Sp. Def\":\"54\",\n" +
                "      \"Species\":\"Lion Cub Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"72\",\n" +
                "      \"Total\":\"369\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Litwick\":{\n" +
                "      \"#\":\"607\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"Litwick shines a light that absorbs the life energy of people and Pok\\u00e9mon, which becomes the fuel that it burns.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Candle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"275\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lombre\":{\n" +
                "      \"#\":\"271\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"In the evening, it takes great delight in popping out of rivers and startling people. It feeds on aquatic moss that grows on rocks in the riverbed.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Jolly Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lopunny\":{\n" +
                "      \"#\":\"428\",\n" +
                "      \"Attack\":\"76\",\n" +
                "      \"Defense\":\"84\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"54\",\n" +
                "      \"Sp. Def\":\"96\",\n" +
                "      \"Species\":\"Rabbit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lopunny ( Mega  Lopunny )\":{\n" +
                "      \"#\":\"428\",\n" +
                "      \"Attack\":\"136\",\n" +
                "      \"Defense\":\"94\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"54\",\n" +
                "      \"Sp. Def\":\"96\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"135\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lotad\":{\n" +
                "      \"#\":\"270\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"This POK\\u00e9MON lives in ponds with clean water. It is known to ferry small POK\\u00e9MON across ponds by carrying them on the broad leaf on its head.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Water Weed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"220\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Loudred\":{\n" +
                "      \"#\":\"294\",\n" +
                "      \"Attack\":\"71\",\n" +
                "      \"Defense\":\"43\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"84\",\n" +
                "      \"Sp. Atk\":\"71\",\n" +
                "      \"Sp. Def\":\"43\",\n" +
                "      \"Species\":\"Big Voice Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"48\",\n" +
                "      \"Total\":\"360\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lucario\":{\n" +
                "      \"#\":\"448\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Aura Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lucario ( Mega  Lucario )\":{\n" +
                "      \"#\":\"448\",\n" +
                "      \"Attack\":\"145\",\n" +
                "      \"Defense\":\"88\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"140\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"112\",\n" +
                "      \"Total\":\"625\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ludicolo\":{\n" +
                "      \"#\":\"272\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"When it hears festive music, all the cells in its body become stimulated, and it begins moving in rhythm. It does not quail even when it faces a tough opponent.\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Carefree Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lugia\":{\n" +
                "      \"#\":\"249\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"106\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"154\",\n" +
                "      \"Species\":\"Diving Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lumineon\":{\n" +
                "      \"#\":\"457\",\n" +
                "      \"Attack\":\"69\",\n" +
                "      \"Defense\":\"76\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"69\",\n" +
                "      \"Sp. Atk\":\"69\",\n" +
                "      \"Sp. Def\":\"86\",\n" +
                "      \"Species\":\"Neon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"91\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Lunatone\":{\n" +
                "      \"#\":\"337\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Meteorite Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Luvdisc\":{\n" +
                "      \"#\":\"370\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"43\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Rendezvous Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"97\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Luxio\":{\n" +
                "      \"#\":\"404\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"49\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"49\",\n" +
                "      \"Species\":\"Spark Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"363\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Luxray\":{\n" +
                "      \"#\":\"405\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"79\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"79\",\n" +
                "      \"Species\":\"Gleam Eyes Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"523\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Machamp\":{\n" +
                "      \"#\":\"068\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Superpower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Machoke\":{\n" +
                "      \"#\":\"067\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Superpower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Machop\":{\n" +
                "      \"#\":\"066\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Superpower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magby\":{\n" +
                "      \"#\":\"240\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"37\",\n" +
                "      \"FlavorText\":\"If a MAGBY is spouting yellow flames from its mouth, it is in good health. When it is fatigued, black smoke will be mixed in with the flames.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Live Coal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"83\",\n" +
                "      \"Total\":\"365\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magcargo\":{\n" +
                "      \"#\":\"219\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Lava Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magikarp\":{\n" +
                "      \"#\":\"129\",\n" +
                "      \"Attack\":\"10\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"20\",\n" +
                "      \"Sp. Atk\":\"15\",\n" +
                "      \"Sp. Def\":\"20\",\n" +
                "      \"Species\":\"Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"200\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magmar\":{\n" +
                "      \"#\":\"126\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"57\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Spitfire Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"93\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magmortar\":{\n" +
                "      \"#\":\"467\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Blast Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"83\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magnemite\":{\n" +
                "      \"#\":\"081\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"25\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Magnet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magneton\":{\n" +
                "      \"#\":\"082\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Magnet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Magnezone\":{\n" +
                "      \"#\":\"462\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Magnet Area Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Makuhita\":{\n" +
                "      \"#\":\"296\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"It loves to toughen up its body above all else. If you hear quaking rumbles in a cave, it is the sound of MAKUHITA undertaking strenuous training.\",\n" +
                "      \"HP\":\"72\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Guts Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"237\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Malamar\":{\n" +
                "      \"#\":\"687\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"88\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"86\",\n" +
                "      \"Sp. Atk\":\"68\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Overturning Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"73\",\n" +
                "      \"Total\":\"482\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mamoswine\":{\n" +
                "      \"#\":\"473\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Twin Tusk Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Manaphy\":{\n" +
                "      \"#\":\"490\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Seafaring Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mandibuzz\":{\n" +
                "      \"#\":\"630\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Bone Vulture Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Manectric\":{\n" +
                "      \"#\":\"310\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Discharge Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Manectric ( Mega  Manectric )\":{\n" +
                "      \"#\":\"310\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"135\",\n" +
                "      \"Total\":\"575\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mankey\":{\n" +
                "      \"#\":\"056\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"It lives in groups in the treetops. If it loses sight of its group, it becomes infuriated by its loneliness.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Pig Monkey Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mantine\":{\n" +
                "      \"#\":\"226\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"140\",\n" +
                "      \"Species\":\"Kite Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mantyke\":{\n" +
                "      \"#\":\"458\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Kite Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"345\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Maractus\":{\n" +
                "      \"#\":\"556\",\n" +
                "      \"Attack\":\"86\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"106\",\n" +
                "      \"Sp. Def\":\"67\",\n" +
                "      \"Species\":\"Cactus Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"461\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mareep\":{\n" +
                "      \"#\":\"179\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"Its fluffy wool rubs together and builds a static charge. The more energy is charged, the more brightly the lightbulb at the tip of its tail glows.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Wool Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Marill\":{\n" +
                "      \"#\":\"183\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Aqua Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Marowak\":{\n" +
                "      \"#\":\"105\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Bone Keeper Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"425\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Marshtomp\":{\n" +
                "      \"#\":\"259\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Mud Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Masquerain\":{\n" +
                "      \"#\":\"284\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"82\",\n" +
                "      \"Species\":\"Eyeball Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"414\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mawile\":{\n" +
                "      \"#\":\"303\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Deceiver Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"380\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mawile ( Mega  Mawile )\":{\n" +
                "      \"#\":\"303\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"125\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Medicham\":{\n" +
                "      \"#\":\"308\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Meditate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Medicham ( Mega  Medicham )\":{\n" +
                "      \"#\":\"308\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meditite\":{\n" +
                "      \"#\":\"307\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Meditate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meganium\":{\n" +
                "      \"#\":\"154\",\n" +
                "      \"Attack\":\"82\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Herb Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meloetta ( Aria  Forme )\":{\n" +
                "      \"#\":\"648\",\n" +
                "      \"Attack\":\"77\",\n" +
                "      \"Defense\":\"77\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"128\",\n" +
                "      \"Sp. Def\":\"128\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meloetta ( Pirouette  Forme )\":{\n" +
                "      \"#\":\"648\",\n" +
                "      \"Attack\":\"128\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"77\",\n" +
                "      \"Sp. Def\":\"77\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"128\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meowstic ( Female )\":{\n" +
                "      \"#\":\"678\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"76\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"74\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"81\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"104\",\n" +
                "      \"Total\":\"466\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meowstic ( Male )\":{\n" +
                "      \"#\":\"678\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"76\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"74\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"81\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"104\",\n" +
                "      \"Total\":\"466\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Meowth\":{\n" +
                "      \"#\":\"052\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"It loves things that sparkle. When it sees a shiny object, the gold coin on its head shines too.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Scratch Cat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mesprit\":{\n" +
                "      \"#\":\"481\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Emotion Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Metagross\":{\n" +
                "      \"#\":\"376\",\n" +
                "      \"Attack\":\"135\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Iron Leg Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Metagross ( Mega  Metagross )\":{\n" +
                "      \"#\":\"376\",\n" +
                "      \"Attack\":\"145\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Metang\":{\n" +
                "      \"#\":\"375\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Iron Claw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Metapod\":{\n" +
                "      \"#\":\"011\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Cocoon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"205\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mew\":{\n" +
                "      \"#\":\"151\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"New Species Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mewtwo\":{\n" +
                "      \"#\":\"150\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"106\",\n" +
                "      \"Sp. Atk\":\"154\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Genetic Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"130\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mewtwo ( Mega  Mewtwo  X )\":{\n" +
                "      \"#\":\"150\",\n" +
                "      \"Attack\":\"190\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"106\",\n" +
                "      \"Sp. Atk\":\"154\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"130\",\n" +
                "      \"Total\":\"780\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mewtwo ( Mega  Mewtwo  Y )\":{\n" +
                "      \"#\":\"150\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"106\",\n" +
                "      \"Sp. Atk\":\"194\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"140\",\n" +
                "      \"Total\":\"780\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mienfoo\":{\n" +
                "      \"#\":\"619\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"In fights, they dominate with onslaughts of flowing, continuous attacks. With their sharp claws, they cut enemies.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Martial Arts Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mienshao\":{\n" +
                "      \"#\":\"620\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"Using the long fur on its arms like whips, it launches into combo attacks that, once started, no one can stop.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Martial Arts Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mightyena\":{\n" +
                "      \"#\":\"262\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"In the wild, MIGHTYENA live in a pack. They never defy their leader\\u2019s orders. They defeat foes with perfectly coordinated teamwork.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Bite Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Milotic\":{\n" +
                "      \"#\":\"350\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"79\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"125\",\n" +
                "      \"Species\":\"Tender Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"81\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Miltank\":{\n" +
                "      \"#\":\"241\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"It gives over five gallons of milk daily. Its sweet milk is enjoyed by children and grown-ups alike. People who can\\u2019t drink milk turn it into yogurt and eat it instead.\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Milk Cow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mime (  Jr. )\":{\n" +
                "      \"#\":\"439\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"20\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Minccino\":{\n" +
                "      \"#\":\"572\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Chinchilla Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Minun\":{\n" +
                "      \"#\":\"312\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Cheering Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Misdreavus\":{\n" +
                "      \"#\":\"200\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Screech Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"435\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mismagius\":{\n" +
                "      \"#\":\"429\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Magical Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Moltres\":{\n" +
                "      \"#\":\"146\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"Legendary bird POK\\u00e9MON. It is said to migrate from the south along with the spring.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Flame Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Monferno\":{\n" +
                "      \"#\":\"391\",\n" +
                "      \"Attack\":\"78\",\n" +
                "      \"Defense\":\"52\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"64\",\n" +
                "      \"Sp. Atk\":\"78\",\n" +
                "      \"Sp. Def\":\"52\",\n" +
                "      \"Species\":\"Playful Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"81\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mothim\":{\n" +
                "      \"#\":\"414\",\n" +
                "      \"Attack\":\"94\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"94\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Moth Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"66\",\n" +
                "      \"Total\":\"424\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mr. (  Mime )\":{\n" +
                "      \"#\":\"122\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Mudkip\":{\n" +
                "      \"#\":\"258\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Mud Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Muk\":{\n" +
                "      \"#\":\"089\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Sludge Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Munchlax\":{\n" +
                "      \"#\":\"446\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"135\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Big Eater Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"5\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Munna\":{\n" +
                "      \"#\":\"517\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"76\",\n" +
                "      \"Sp. Atk\":\"67\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Dream Eater Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"24\",\n" +
                "      \"Total\":\"292\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Murkrow\":{\n" +
                "      \"#\":\"198\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"42\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"42\",\n" +
                "      \"Species\":\"Darkness Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"91\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Musharna\":{\n" +
                "      \"#\":\"518\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"116\",\n" +
                "      \"Sp. Atk\":\"107\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Drowsing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"29\",\n" +
                "      \"Total\":\"487\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Natu\":{\n" +
                "      \"#\":\"177\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Tiny Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nidoking\":{\n" +
                "      \"#\":\"034\",\n" +
                "      \"Attack\":\"102\",\n" +
                "      \"Defense\":\"77\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"81\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Drill Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nidoqueen\":{\n" +
                "      \"#\":\"031\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"87\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Drill Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"76\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nidoran\\u2640\":{\n" +
                "      \"#\":\"029\",\n" +
                "      \"Attack\":\"47\",\n" +
                "      \"Defense\":\"52\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"41\",\n" +
                "      \"Total\":\"275\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nidoran\\u2642\":{\n" +
                "      \"#\":\"032\",\n" +
                "      \"Attack\":\"57\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"46\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"273\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nidorina\":{\n" +
                "      \"#\":\"030\",\n" +
                "      \"Attack\":\"62\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Poison Pin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"56\",\n" +
                "      \"Total\":\"365\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nidorino\":{\n" +
                "      \"#\":\"033\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"57\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"61\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Poison Pin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"365\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nincada\":{\n" +
                "      \"#\":\"290\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"31\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Trainee Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"266\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ninetales\":{\n" +
                "      \"#\":\"038\",\n" +
                "      \"Attack\":\"76\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"73\",\n" +
                "      \"Sp. Atk\":\"81\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ninjask\":{\n" +
                "      \"#\":\"291\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"61\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Ninja Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"160\",\n" +
                "      \"Total\":\"456\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Noctowl\":{\n" +
                "      \"#\":\"164\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"76\",\n" +
                "      \"Sp. Def\":\"96\",\n" +
                "      \"Species\":\"Owl Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"442\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Noibat\":{\n" +
                "      \"#\":\"714\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Sound Wave Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"245\",\n" +
                "      \"Type\":[\n" +
                "         \"Flying\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Noivern\":{\n" +
                "      \"#\":\"715\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"97\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Sound Wave Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"123\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Flying\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nosepass\":{\n" +
                "      \"#\":\"299\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"135\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Compass Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"375\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Numel\":{\n" +
                "      \"#\":\"322\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"A NUMEL stores boiling magma in the hump on its back. It is a hardy POK\\u00e9MON that can transport a 220-pound load. It has served humans at work since long ago.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Numb Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Nuzleaf\":{\n" +
                "      \"#\":\"274\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Wily Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Octillery\":{\n" +
                "      \"#\":\"224\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Jet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Oddish\":{\n" +
                "      \"#\":\"043\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Weed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Omanyte\":{\n" +
                "      \"#\":\"138\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"In prehistoric times, it swam on the sea floor, eating plankton. Its fossils are sometimes found.\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Spiral Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"355\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Omastar\":{\n" +
                "      \"#\":\"139\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"125\",\n" +
                "      \"FlavorText\":\"Its heavy shell allowed it to reach only nearby food. This could be the reason it is extinct.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Spiral Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Onix\":{\n" +
                "      \"#\":\"095\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"160\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Rock Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"385\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Oshawott\":{\n" +
                "      \"#\":\"501\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"63\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Sea Otter Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"308\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pachirisu\":{\n" +
                "      \"#\":\"417\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"EleSquirrel Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Palkia\":{\n" +
                "      \"#\":\"484\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Spatial Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Palpitoad\":{\n" +
                "      \"#\":\"536\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Vibration Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"69\",\n" +
                "      \"Total\":\"384\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pancham\":{\n" +
                "      \"#\":\"674\",\n" +
                "      \"Attack\":\"82\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"67\",\n" +
                "      \"Sp. Atk\":\"46\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Playful Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"43\",\n" +
                "      \"Total\":\"348\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pangoro\":{\n" +
                "      \"#\":\"675\",\n" +
                "      \"Attack\":\"124\",\n" +
                "      \"Defense\":\"78\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"69\",\n" +
                "      \"Sp. Def\":\"71\",\n" +
                "      \"Species\":\"Daunting Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Panpour\":{\n" +
                "      \"#\":\"515\",\n" +
                "      \"Attack\":\"53\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"53\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Spray Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"64\",\n" +
                "      \"Total\":\"316\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pansage\":{\n" +
                "      \"#\":\"511\",\n" +
                "      \"Attack\":\"53\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"53\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Grass Monkey Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"64\",\n" +
                "      \"Total\":\"316\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pansear\":{\n" +
                "      \"#\":\"513\",\n" +
                "      \"Attack\":\"53\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"53\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"High Temp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"64\",\n" +
                "      \"Total\":\"316\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Paras\":{\n" +
                "      \"#\":\"046\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"A PARAS has parasitic tochukaso mushrooms growing on its back. They grow by drawing nutrients from the host. They are valued as a medicine for long life.\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Mushroom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"285\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Parasect\":{\n" +
                "      \"#\":\"047\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"When nothing's left to extract from the bug, the mushrooms on its back leave spores on the bug's egg.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Mushroom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Patrat\":{\n" +
                "      \"#\":\"504\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"39\",\n" +
                "      \"FlavorText\":\"Extremely cautious, one of them will always be on the lookout, but it won\\u2019t notice a foe coming from behind.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"39\",\n" +
                "      \"Species\":\"Scout Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"42\",\n" +
                "      \"Total\":\"255\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pawniard\":{\n" +
                "      \"#\":\"624\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"Ignoring their injuries, groups attack by sinking the blades that cover their bodies into their prey.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Sharp Blade Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pelipper\":{\n" +
                "      \"#\":\"279\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Water Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Persian\":{\n" +
                "      \"#\":\"053\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"Behind its lithe, elegant appearance lies a barbaric side. It will tear apart its prey on a mere whim.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Classy Cat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Petilil\":{\n" +
                "      \"#\":\"548\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Bulb Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Phanpy\":{\n" +
                "      \"#\":\"231\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Long Nose Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Phantump\":{\n" +
                "      \"#\":\"708\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"43\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Stump Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"38\",\n" +
                "      \"Total\":\"309\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Phione\":{\n" +
                "      \"#\":\"489\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Sea Drifter Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pichu\":{\n" +
                "      \"#\":\"172\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"15\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"20\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Tiny Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"205\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pidgeot\":{\n" +
                "      \"#\":\"018\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"83\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"479\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pidgeot ( Mega  Pidgeot )\":{\n" +
                "      \"#\":\"018\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"83\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"121\",\n" +
                "      \"Total\":\"579\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pidgeotto\":{\n" +
                "      \"#\":\"017\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"63\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"71\",\n" +
                "      \"Total\":\"349\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pidgey\":{\n" +
                "      \"#\":\"016\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Tiny Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"56\",\n" +
                "      \"Total\":\"251\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pidove\":{\n" +
                "      \"#\":\"519\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"36\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Tiny Pigeon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"43\",\n" +
                "      \"Total\":\"264\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pignite\":{\n" +
                "      \"#\":\"499\",\n" +
                "      \"Attack\":\"93\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Fire Pig Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"418\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pikachu\":{\n" +
                "      \"#\":\"025\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Piloswine\":{\n" +
                "      \"#\":\"221\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Swine Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pineco\":{\n" +
                "      \"#\":\"204\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Bagworm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pinsir\":{\n" +
                "      \"#\":\"127\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Stag Beetle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pinsir ( Mega  Pinsir )\":{\n" +
                "      \"#\":\"127\",\n" +
                "      \"Attack\":\"155\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Piplup\":{\n" +
                "      \"#\":\"393\",\n" +
                "      \"Attack\":\"51\",\n" +
                "      \"Defense\":\"53\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"53\",\n" +
                "      \"Sp. Atk\":\"61\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Penguin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"314\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Plusle\":{\n" +
                "      \"#\":\"311\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Cheering Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Politoed\":{\n" +
                "      \"#\":\"186\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"The curled hair on its head proves its status as a king. It is said that the longer and curlier the hair, the more respect it earns from its peers.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Frog Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Poliwag\":{\n" +
                "      \"#\":\"060\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Tadpole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Poliwhirl\":{\n" +
                "      \"#\":\"061\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Tadpole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"385\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Poliwrath\":{\n" +
                "      \"#\":\"062\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Tadpole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ponyta\":{\n" +
                "      \"#\":\"077\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Fire Horse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Poochyena\":{\n" +
                "      \"#\":\"261\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"It savagely threatens foes with bared fangs. It chases after fleeing targets tenaciously. It turns tail and runs, however, if the foe strikes back.\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Bite Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"220\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Porygon\":{\n" +
                "      \"#\":\"137\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Virtual Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"395\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Porygon- ( Z )\":{\n" +
                "      \"#\":\"474\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Porygon2\":{\n" +
                "      \"#\":\"233\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"It was created by humans using the power of science. It has been given artificial intelligence that enables it to learn new gestures and emotions on its own.\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Virtual Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Primeape\":{\n" +
                "      \"#\":\"057\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"It will beat up anyone who makes it mad, even if it has to chase them until the end of the world.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Pig Monkey Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"455\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Prinplup\":{\n" +
                "      \"#\":\"394\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"68\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"64\",\n" +
                "      \"Sp. Atk\":\"81\",\n" +
                "      \"Sp. Def\":\"76\",\n" +
                "      \"Species\":\"Penguin Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Probopass\":{\n" +
                "      \"#\":\"476\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"145\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"Compass Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Psyduck\":{\n" +
                "      \"#\":\"054\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Duck Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pumpkaboo ( Average  Size )\":{\n" +
                "      \"#\":\"710\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"49\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"51\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pumpkaboo ( Large  Size )\":{\n" +
                "      \"#\":\"710\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"54\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"46\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pumpkaboo ( Small  Size )\":{\n" +
                "      \"#\":\"710\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"56\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pumpkaboo ( Super  Size )\":{\n" +
                "      \"#\":\"710\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"59\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"41\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pupitar\":{\n" +
                "      \"#\":\"247\",\n" +
                "      \"Attack\":\"84\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Hard Shell Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"51\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Purrloin\":{\n" +
                "      \"#\":\"509\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"37\",\n" +
                "      \"FlavorText\":\"They steal from people for fun, but their victims can\\u2019t help but forgive them. Their deceptively cute act is perfect.\",\n" +
                "      \"HP\":\"41\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"37\",\n" +
                "      \"Species\":\"Devious Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"66\",\n" +
                "      \"Total\":\"281\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Purugly\":{\n" +
                "      \"#\":\"432\",\n" +
                "      \"Attack\":\"82\",\n" +
                "      \"Defense\":\"64\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"71\",\n" +
                "      \"Sp. Atk\":\"64\",\n" +
                "      \"Sp. Def\":\"59\",\n" +
                "      \"Species\":\"Tiger Cat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"112\",\n" +
                "      \"Total\":\"452\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Pyroar\":{\n" +
                "      \"#\":\"668\",\n" +
                "      \"Attack\":\"68\",\n" +
                "      \"Defense\":\"72\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"86\",\n" +
                "      \"Sp. Atk\":\"109\",\n" +
                "      \"Sp. Def\":\"66\",\n" +
                "      \"Species\":\"Royal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"106\",\n" +
                "      \"Total\":\"507\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Quagsire\":{\n" +
                "      \"#\":\"195\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Water Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Quilava\":{\n" +
                "      \"#\":\"156\",\n" +
                "      \"Attack\":\"64\",\n" +
                "      \"Defense\":\"58\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"58\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Volcano Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Quilladin\":{\n" +
                "      \"#\":\"651\",\n" +
                "      \"Attack\":\"78\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"61\",\n" +
                "      \"Sp. Atk\":\"56\",\n" +
                "      \"Sp. Def\":\"58\",\n" +
                "      \"Species\":\"Spiny Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"57\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Qwilfish\":{\n" +
                "      \"#\":\"211\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"A QWILFISH uses the pressure of water it swallows to shoot toxic quills all at once from all over its body. It finds swimming to be somewhat challenging.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Balloon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Raichu\":{\n" +
                "      \"#\":\"026\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Raikou\":{\n" +
                "      \"#\":\"243\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"115\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Thunder Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ralts\":{\n" +
                "      \"#\":\"280\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"25\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"28\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Feeling Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"198\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rampardos\":{\n" +
                "      \"#\":\"409\",\n" +
                "      \"Attack\":\"165\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"97\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Head Butt Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"495\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rapidash\":{\n" +
                "      \"#\":\"078\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Fire Horse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Raticate\":{\n" +
                "      \"#\":\"020\",\n" +
                "      \"Attack\":\"81\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"97\",\n" +
                "      \"Total\":\"413\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rattata\":{\n" +
                "      \"#\":\"019\",\n" +
                "      \"Attack\":\"56\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"72\",\n" +
                "      \"Total\":\"253\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rayquaza\":{\n" +
                "      \"#\":\"384\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Sky High Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rayquaza ( Mega  Rayquaza )\":{\n" +
                "      \"#\":\"384\",\n" +
                "      \"Attack\":\"180\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"180\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"780\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Regice\":{\n" +
                "      \"#\":\"378\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"200\",\n" +
                "      \"Species\":\"Iceberg Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Regigigas\":{\n" +
                "      \"#\":\"486\",\n" +
                "      \"Attack\":\"160\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Colossal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"670\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Regirock\":{\n" +
                "      \"#\":\"377\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"200\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Rock Peak Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Registeel\":{\n" +
                "      \"#\":\"379\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"150\",\n" +
                "      \"Species\":\"Iron Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Relicanth\":{\n" +
                "      \"#\":\"369\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"A POK\\u00e9MON that was once believed to have been extinct. The species has not changed its form for 100 million years. It walks on the seafloor using its pectoral fins.\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Longevity Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Remoraid\":{\n" +
                "      \"#\":\"223\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Jet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Reshiram\":{\n" +
                "      \"#\":\"643\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"150\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Vast White Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Reuniclus\":{\n" +
                "      \"#\":\"579\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"When Reuniclus shake hands, a network forms between their brains, increasing their psychic power.\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Multiplying Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rhydon\":{\n" +
                "      \"#\":\"112\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Drill Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rhyhorn\":{\n" +
                "      \"#\":\"111\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Spikes Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"345\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rhyperior\":{\n" +
                "      \"#\":\"464\",\n" +
                "      \"Attack\":\"140\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"It can launch a rock held in its hand like a missile by tightening then expanding muscles instantly.\",\n" +
                "      \"HP\":\"115\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Drill Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Riolu\":{\n" +
                "      \"#\":\"447\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Emanation Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"285\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Roggenrola\":{\n" +
                "      \"#\":\"524\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Mantle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Roselia\":{\n" +
                "      \"#\":\"315\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Thorn Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"400\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Roserade\":{\n" +
                "      \"#\":\"407\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Bouquet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rotom\":{\n" +
                "      \"#\":\"479\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"77\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"77\",\n" +
                "      \"Species\":\"Plasma Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"91\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rotom ( Fan  Rotom )\":{\n" +
                "      \"#\":\"479\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"107\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"107\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"86\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rotom ( Frost  Rotom )\":{\n" +
                "      \"#\":\"479\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"107\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"107\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"86\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rotom ( Heat  Rotom )\":{\n" +
                "      \"#\":\"479\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"107\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"107\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"86\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rotom ( Mow  Rotom )\":{\n" +
                "      \"#\":\"479\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"107\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"107\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"86\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rotom ( Wash  Rotom )\":{\n" +
                "      \"#\":\"479\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"107\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"107\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"86\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Rufflet\":{\n" +
                "      \"#\":\"627\",\n" +
                "      \"Attack\":\"83\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"37\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Eaglet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sableye\":{\n" +
                "      \"#\":\"302\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Darkness Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"380\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sableye ( Mega  Sableye )\":{\n" +
                "      \"#\":\"302\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"125\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Salamence\":{\n" +
                "      \"#\":\"373\",\n" +
                "      \"Attack\":\"135\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Salamence ( Mega  Salamence )\":{\n" +
                "      \"#\":\"373\",\n" +
                "      \"Attack\":\"145\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"120\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Samurott\":{\n" +
                "      \"#\":\"503\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"108\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Formidable Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"528\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sandile\":{\n" +
                "      \"#\":\"551\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"They live buried in the sands of the desert. The sun-warmed sands prevent their body temperature from dropping.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Desert Croc Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"292\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sandshrew\":{\n" +
                "      \"#\":\"027\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sandslash\":{\n" +
                "      \"#\":\"028\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Mouse Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sawk\":{\n" +
                "      \"#\":\"539\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"Tying their belts gets them pumped and makes their punches more destructive. Disturbing their training angers them.\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Karate Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sawsbuck\":{\n" +
                "      \"#\":\"586\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Season Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"475\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scatterbug\":{\n" +
                "      \"#\":\"664\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"38\",\n" +
                "      \"Sp. Atk\":\"27\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Scatterdust Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"200\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sceptile\":{\n" +
                "      \"#\":\"254\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Forest Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"120\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sceptile ( Mega  Sceptile )\":{\n" +
                "      \"#\":\"254\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"145\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"145\",\n" +
                "      \"Total\":\"630\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scizor\":{\n" +
                "      \"#\":\"212\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Pincer Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scizor ( Mega  Scizor )\":{\n" +
                "      \"#\":\"212\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"140\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scolipede\":{\n" +
                "      \"#\":\"545\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"89\",\n" +
                "      \"FlavorText\":\"With quick movements, it chases down its foes, attacking relentlessly with its horns until it prevails.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"69\",\n" +
                "      \"Species\":\"Megapede Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"112\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scrafty\":{\n" +
                "      \"#\":\"560\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"It can smash concrete blocks with its kicking attacks. The one with the biggest crest is the group leader.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"Hoodlum Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"488\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scraggy\":{\n" +
                "      \"#\":\"559\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"Proud of its sturdy skull, it suddenly headbutts everything, but its weight makes it unstable, too.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Shedding Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"48\",\n" +
                "      \"Total\":\"348\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Scyther\":{\n" +
                "      \"#\":\"123\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Mantis Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Seadra\":{\n" +
                "      \"#\":\"117\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Dragon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Seaking\":{\n" +
                "      \"#\":\"119\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Goldfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"68\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sealeo\":{\n" +
                "      \"#\":\"364\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"SEALEO live in herds on ice floes. Using its powerful flippers, it shatters ice. It dives into the sea to hunt prey five times a day.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Ball Roll Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Seedot\":{\n" +
                "      \"#\":\"273\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Acorn Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"220\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Seel\":{\n" +
                "      \"#\":\"086\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Sea Lion Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Seismitoad\":{\n" +
                "      \"#\":\"537\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"105\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Vibration Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"74\",\n" +
                "      \"Total\":\"509\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sentret\":{\n" +
                "      \"#\":\"161\",\n" +
                "      \"Attack\":\"46\",\n" +
                "      \"Defense\":\"34\",\n" +
                "      \"FlavorText\":\"They take turns standing guard when it is time to sleep. The sentry awakens the others if it senses danger. If one becomes separated, it turns sleepless with fear.\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Scout Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"215\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Serperior\":{\n" +
                "      \"#\":\"497\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Regal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"113\",\n" +
                "      \"Total\":\"528\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Servine\":{\n" +
                "      \"#\":\"496\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Grass Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"83\",\n" +
                "      \"Total\":\"413\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Seviper\":{\n" +
                "      \"#\":\"336\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"SEVIPER and ZANGOOSE are eternal rivals. It counters a ZANGOOSE\\u2019s dazzling agility with its swordlike tail, which also oozes a horrible poison.\",\n" +
                "      \"HP\":\"73\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Fang Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"458\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sewaddle\":{\n" +
                "      \"#\":\"540\",\n" +
                "      \"Attack\":\"53\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Sewing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"42\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sharpedo\":{\n" +
                "      \"#\":\"319\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Brutal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sharpedo ( Mega  Sharpedo )\":{\n" +
                "      \"#\":\"319\",\n" +
                "      \"Attack\":\"140\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"560\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shaymin ( Land  Forme )\":{\n" +
                "      \"#\":\"492\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shaymin ( Sky  Forme )\":{\n" +
                "      \"#\":\"492\",\n" +
                "      \"Attack\":\"103\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"127\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shedinja\":{\n" +
                "      \"#\":\"292\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"1\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Shed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"236\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shelgon\":{\n" +
                "      \"#\":\"372\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Endurance Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shellder\":{\n" +
                "      \"#\":\"090\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Bivalve Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shellos\":{\n" +
                "      \"#\":\"422\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"76\",\n" +
                "      \"Sp. Atk\":\"57\",\n" +
                "      \"Sp. Def\":\"62\",\n" +
                "      \"Species\":\"Sea Slug Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"34\",\n" +
                "      \"Total\":\"325\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shelmet\":{\n" +
                "      \"#\":\"616\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"It evolves when bathed in an electric-like energy along with Karrablast. The reason is still unknown.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Snail Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shieldon\":{\n" +
                "      \"#\":\"410\",\n" +
                "      \"Attack\":\"42\",\n" +
                "      \"Defense\":\"118\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"42\",\n" +
                "      \"Sp. Def\":\"88\",\n" +
                "      \"Species\":\"Shield Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shiftry\":{\n" +
                "      \"#\":\"275\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Wicked Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shinx\":{\n" +
                "      \"#\":\"403\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"34\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"34\",\n" +
                "      \"Species\":\"Flash Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"263\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shroomish\":{\n" +
                "      \"#\":\"285\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Mushroom Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"295\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shuckle\":{\n" +
                "      \"#\":\"213\",\n" +
                "      \"Attack\":\"10\",\n" +
                "      \"Defense\":\"230\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"20\",\n" +
                "      \"Sp. Atk\":\"10\",\n" +
                "      \"Sp. Def\":\"230\",\n" +
                "      \"Species\":\"Mold Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"5\",\n" +
                "      \"Total\":\"505\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Shuppet\":{\n" +
                "      \"#\":\"353\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"63\",\n" +
                "      \"Sp. Def\":\"33\",\n" +
                "      \"Species\":\"Puppet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"295\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sigilyph\":{\n" +
                "      \"#\":\"561\",\n" +
                "      \"Attack\":\"58\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"The guardians of an ancient city, they always fly the same route while keeping watch for invaders.\",\n" +
                "      \"HP\":\"72\",\n" +
                "      \"Sp. Atk\":\"103\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Avianoid Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"97\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Silcoon\":{\n" +
                "      \"#\":\"266\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Cocoon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"205\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Simipour\":{\n" +
                "      \"#\":\"516\",\n" +
                "      \"Attack\":\"98\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"98\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Geyser Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"498\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Simisage\":{\n" +
                "      \"#\":\"512\",\n" +
                "      \"Attack\":\"98\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"98\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Thorn Monkey Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"498\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Simisear\":{\n" +
                "      \"#\":\"514\",\n" +
                "      \"Attack\":\"98\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"98\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Ember Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"498\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skarmory\":{\n" +
                "      \"#\":\"227\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"140\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Armor Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skiddo\":{\n" +
                "      \"#\":\"672\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"66\",\n" +
                "      \"Sp. Atk\":\"62\",\n" +
                "      \"Sp. Def\":\"57\",\n" +
                "      \"Species\":\"Mount Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"52\",\n" +
                "      \"Total\":\"350\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skiploom\":{\n" +
                "      \"#\":\"188\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"It blossoms when the temperature rises above 64 degrees F. Because its flower\\u2019s blooming changes with the temperature, it is sometimes used as a thermometer.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Cottonweed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skitty\":{\n" +
                "      \"#\":\"300\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Kitten Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"260\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skorupi\":{\n" +
                "      \"#\":\"451\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Scorpion Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skrelp\":{\n" +
                "      \"#\":\"690\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Mock Kelp Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"320\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Skuntank\":{\n" +
                "      \"#\":\"435\",\n" +
                "      \"Attack\":\"93\",\n" +
                "      \"Defense\":\"67\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"103\",\n" +
                "      \"Sp. Atk\":\"71\",\n" +
                "      \"Sp. Def\":\"61\",\n" +
                "      \"Species\":\"Skunk Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"84\",\n" +
                "      \"Total\":\"479\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slaking\":{\n" +
                "      \"#\":\"289\",\n" +
                "      \"Attack\":\"160\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"150\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Lazy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"670\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slakoth\":{\n" +
                "      \"#\":\"287\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Slacker Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"280\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sliggoo\":{\n" +
                "      \"#\":\"705\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"53\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"68\",\n" +
                "      \"Sp. Atk\":\"83\",\n" +
                "      \"Sp. Def\":\"113\",\n" +
                "      \"Species\":\"Soft Tissue Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"452\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slowbro\":{\n" +
                "      \"#\":\"080\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Hermit Crab Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slowbro ( Mega  Slowbro )\":{\n" +
                "      \"#\":\"080\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"180\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"590\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slowking\":{\n" +
                "      \"#\":\"199\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"It undertakes research every day to solve the mysteries of the world. However, it apparently forgets everything if the SHELLDER on its head comes off.\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Royal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slowpoke\":{\n" +
                "      \"#\":\"079\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Dopey Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"315\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slugma\":{\n" +
                "      \"#\":\"218\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Lava Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Slurpuff\":{\n" +
                "      \"#\":\"685\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"86\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"82\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Meringue Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"72\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Smeargle\":{\n" +
                "      \"#\":\"235\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"A SMEARGLE marks its territory using a fluid that leaks out from the tip of its tail. About 5,000 different marks left by this POK\\u00e9MON have been found.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Painter Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"75\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Smoochum\":{\n" +
                "      \"#\":\"238\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"15\",\n" +
                "      \"FlavorText\":\"It actively runs about, but also falls often. Whenever it falls, it will check its reflection on a lake\\u2019s surface to make sure its face hasn\\u2019t become dirty.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Kiss Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sneasel\":{\n" +
                "      \"#\":\"215\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Sharp Claw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Snivy\":{\n" +
                "      \"#\":\"495\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Grass Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"63\",\n" +
                "      \"Total\":\"308\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Snorlax\":{\n" +
                "      \"#\":\"143\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"160\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"Sleeping Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"540\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Snorunt\":{\n" +
                "      \"#\":\"361\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"They tend to move about in groups of around five SNORUNT. In snowy regions, it is said that when they are seen late at night, snowfall will arrive by morning.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Snow Hat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Snover\":{\n" +
                "      \"#\":\"459\",\n" +
                "      \"Attack\":\"62\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"62\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Frost Tree Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"334\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Snubbull\":{\n" +
                "      \"#\":\"209\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"By baring its fangs and making a scary face, it sends smaller POK\\u00e9MON scurrying in terror. The SNUBBULL does seem a little sad at making its foes flee.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Fairy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"300\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Solosis\":{\n" +
                "      \"#\":\"577\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"They drive away attackers by unleashing psychic power. They can use telepathy to talk with others.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Cell Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Solrock\":{\n" +
                "      \"#\":\"338\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Meteorite Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spearow\":{\n" +
                "      \"#\":\"021\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"To protect its territory, it flies around ceaselessly, making high-pitched cries.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"31\",\n" +
                "      \"Sp. Def\":\"31\",\n" +
                "      \"Species\":\"Tiny Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"262\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spewpa\":{\n" +
                "      \"#\":\"665\",\n" +
                "      \"Attack\":\"22\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"27\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Scatterdust Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"29\",\n" +
                "      \"Total\":\"213\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spheal\":{\n" +
                "      \"#\":\"363\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"It is completely covered with plushy fur. As a result, it never feels the cold even when it is rolling about on ice floes or diving in the sea.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Clap Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"25\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spinarak\":{\n" +
                "      \"#\":\"167\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"The web it spins can be considered its second nervous system. It is said that a SPINARAK determines its prey by the tiny vibrations it feels through the web.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"String Spit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spinda\":{\n" +
                "      \"#\":\"327\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"It is distinguished by a pattern of spots that is always different. Its unsteady, tottering walk has the effect of fouling its foe\\u2019s aim.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Spot Panda Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"360\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spiritomb\":{\n" +
                "      \"#\":\"442\",\n" +
                "      \"Attack\":\"92\",\n" +
                "      \"Defense\":\"108\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"92\",\n" +
                "      \"Sp. Def\":\"108\",\n" +
                "      \"Species\":\"Forbidden Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spoink\":{\n" +
                "      \"#\":\"325\",\n" +
                "      \"Attack\":\"25\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Bounce Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Spritzee\":{\n" +
                "      \"#\":\"682\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"63\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Perfume Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"23\",\n" +
                "      \"Total\":\"341\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Squirtle\":{\n" +
                "      \"#\":\"007\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"When it feels threatened, it draws its legs inside its shell and sprays water from its mouth.\",\n" +
                "      \"HP\":\"44\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"64\",\n" +
                "      \"Species\":\"Tiny Turtle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"43\",\n" +
                "      \"Total\":\"314\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Stantler\":{\n" +
                "      \"#\":\"234\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"73\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Big Horn Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Staraptor\":{\n" +
                "      \"#\":\"398\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Predator Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"485\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Staravia\":{\n" +
                "      \"#\":\"397\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Starling Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Starly\":{\n" +
                "      \"#\":\"396\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Starling Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"245\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Starmie\":{\n" +
                "      \"#\":\"121\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Mysterious Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"115\",\n" +
                "      \"Total\":\"520\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Staryu\":{\n" +
                "      \"#\":\"120\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Star Shape Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Steelix\":{\n" +
                "      \"#\":\"208\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"200\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Iron Snake Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Steelix ( Mega  Steelix )\":{\n" +
                "      \"#\":\"208\",\n" +
                "      \"Attack\":\"125\",\n" +
                "      \"Defense\":\"230\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"610\",\n" +
                "      \"Type\":[\n" +
                "         \"Steel\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Stoutland\":{\n" +
                "      \"#\":\"508\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Big-Hearted Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Stunfisk\":{\n" +
                "      \"#\":\"618\",\n" +
                "      \"Attack\":\"66\",\n" +
                "      \"Defense\":\"84\",\n" +
                "      \"FlavorText\":\"It conceals itself in the mud of the seashore. Then it waits. When prey touch it, it delivers a jolt of electricity.\",\n" +
                "      \"HP\":\"109\",\n" +
                "      \"Sp. Atk\":\"81\",\n" +
                "      \"Sp. Def\":\"99\",\n" +
                "      \"Species\":\"Trap Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"32\",\n" +
                "      \"Total\":\"471\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Stunky\":{\n" +
                "      \"#\":\"434\",\n" +
                "      \"Attack\":\"63\",\n" +
                "      \"Defense\":\"47\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"63\",\n" +
                "      \"Sp. Atk\":\"41\",\n" +
                "      \"Sp. Def\":\"41\",\n" +
                "      \"Species\":\"Skunk Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"74\",\n" +
                "      \"Total\":\"329\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sudowoodo\":{\n" +
                "      \"#\":\"185\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Imitation Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"410\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Suicune\":{\n" +
                "      \"#\":\"245\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"Aurora Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sunflora\":{\n" +
                "      \"#\":\"192\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"SUNFLORA convert solar energy into nutrition. They are highly active in the warm daytime but suddenly stop moving as soon as the sun sets.\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"105\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Sun Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"425\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sunkern\":{\n" +
                "      \"#\":\"191\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"SUNKERN try to minimize movement to conserve the nutrients they have stored in their bodies for evolution. They will not eat, subsisting only on morning dew.\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Seed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"180\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Surskit\":{\n" +
                "      \"#\":\"283\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"32\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"52\",\n" +
                "      \"Species\":\"Pond Skater Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"269\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swablu\":{\n" +
                "      \"#\":\"333\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Cotton Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swadloon\":{\n" +
                "      \"#\":\"541\",\n" +
                "      \"Attack\":\"63\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Leaf-Wrapped Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"42\",\n" +
                "      \"Total\":\"380\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swalot\":{\n" +
                "      \"#\":\"317\",\n" +
                "      \"Attack\":\"73\",\n" +
                "      \"Defense\":\"83\",\n" +
                "      \"FlavorText\":\"Its powerful stomach acid is capable of digesting almost anything. The one thing in the whole world a SWALOT can\\u2019t digest is its own stomach.\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"73\",\n" +
                "      \"Sp. Def\":\"83\",\n" +
                "      \"Species\":\"Poison Bag Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"467\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swampert\":{\n" +
                "      \"#\":\"260\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Mud Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swampert ( Mega  Swampert )\":{\n" +
                "      \"#\":\"260\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"110\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"635\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swanna\":{\n" +
                "      \"#\":\"581\",\n" +
                "      \"Attack\":\"87\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"Swanna start to dance at dusk. The one dancing in the middle is the leader of the flock.\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"87\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"White Bird Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"98\",\n" +
                "      \"Total\":\"473\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swellow\":{\n" +
                "      \"#\":\"277\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Swallow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"125\",\n" +
                "      \"Total\":\"430\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swinub\":{\n" +
                "      \"#\":\"220\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Pig Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"250\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swirlix\":{\n" +
                "      \"#\":\"684\",\n" +
                "      \"Attack\":\"48\",\n" +
                "      \"Defense\":\"66\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"59\",\n" +
                "      \"Sp. Def\":\"57\",\n" +
                "      \"Species\":\"Cotton Candy Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"49\",\n" +
                "      \"Total\":\"341\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Swoobat\":{\n" +
                "      \"#\":\"528\",\n" +
                "      \"Attack\":\"57\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"Anyone who comes into contact with the ultrasonic waves emitted by a courting male experiences a positive mood shift.\",\n" +
                "      \"HP\":\"67\",\n" +
                "      \"Sp. Atk\":\"77\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Courting Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"114\",\n" +
                "      \"Total\":\"425\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Sylveon\":{\n" +
                "      \"#\":\"700\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"Intertwining Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Taillow\":{\n" +
                "      \"#\":\"276\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"TinySwallow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"270\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Talonflame\":{\n" +
                "      \"#\":\"663\",\n" +
                "      \"Attack\":\"81\",\n" +
                "      \"Defense\":\"71\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"74\",\n" +
                "      \"Sp. Def\":\"69\",\n" +
                "      \"Species\":\"Scorching Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"126\",\n" +
                "      \"Total\":\"499\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tangela\":{\n" +
                "      \"#\":\"114\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"115\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Vine Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"435\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tangrowth\":{\n" +
                "      \"#\":\"465\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"125\",\n" +
                "      \"FlavorText\":\"Its vines grow so profusely that, in the warm season, you can\\u2019t even see its eyes.\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Vine Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tauros\":{\n" +
                "      \"#\":\"128\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Wild Bull Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"110\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Teddiursa\":{\n" +
                "      \"#\":\"216\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"It licks its palms that are sweetened by being soaked in honey. A TEDDIURSA makes its own honey by blending fruits and pollen collected by BEEDRILL.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Little Bear Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tentacool\":{\n" +
                "      \"#\":\"072\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Jellyfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"335\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tentacruel\":{\n" +
                "      \"#\":\"073\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"Jellyfish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tepig\":{\n" +
                "      \"#\":\"498\",\n" +
                "      \"Attack\":\"63\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Fire Pig Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"308\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Terrakion\":{\n" +
                "      \"#\":\"639\",\n" +
                "      \"Attack\":\"129\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"72\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Cavern Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Throh\":{\n" +
                "      \"#\":\"538\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"When it encounters a foe bigger than itself, it wants to throw it. It changes belts as it gets stronger.\",\n" +
                "      \"HP\":\"120\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Judo Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"465\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Thundurus ( Incarnate  Forme )\":{\n" +
                "      \"#\":\"642\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"111\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Thundurus ( Therian  Forme )\":{\n" +
                "      \"#\":\"642\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"145\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"101\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Timburr\":{\n" +
                "      \"#\":\"532\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"Always carrying squared logs, they help out with construction. As they grow, they carry bigger logs.\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Muscular Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tirtouga\":{\n" +
                "      \"#\":\"564\",\n" +
                "      \"Attack\":\"78\",\n" +
                "      \"Defense\":\"103\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"54\",\n" +
                "      \"Sp. Atk\":\"53\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Prototurtle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"22\",\n" +
                "      \"Total\":\"355\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Rock\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Togekiss\":{\n" +
                "      \"#\":\"468\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"115\",\n" +
                "      \"Species\":\"Jubilee Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"545\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Togepi\":{\n" +
                "      \"#\":\"175\",\n" +
                "      \"Attack\":\"20\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"As its energy, it uses the feelings of compassion and pleasure exuded by people and POK\\u00e9MON. It stores up happy feelings in its shell, then shares them out.\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Spike Ball Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"245\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Togetic\":{\n" +
                "      \"#\":\"176\",\n" +
                "      \"Attack\":\"40\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"It is said to be a POK\\u00e9MON that brings good fortune. When it spots someone who is pure of heart, a TOGETIC appears and shares its happiness with that person.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Happiness Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Torchic\":{\n" +
                "      \"#\":\"255\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Chick Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Torkoal\":{\n" +
                "      \"#\":\"324\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"140\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Coal Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"470\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tornadus ( Incarnate  Forme )\":{\n" +
                "      \"#\":\"641\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"111\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tornadus ( Therian  Forme )\":{\n" +
                "      \"#\":\"641\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"79\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"121\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Torterra\":{\n" +
                "      \"#\":\"389\",\n" +
                "      \"Attack\":\"109\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Continent Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"56\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Totodile\":{\n" +
                "      \"#\":\"158\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"64\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"44\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Big Jaw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"43\",\n" +
                "      \"Total\":\"314\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Toxicroak\":{\n" +
                "      \"#\":\"454\",\n" +
                "      \"Attack\":\"106\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"83\",\n" +
                "      \"Sp. Atk\":\"86\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Toxic Mouth Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tranquill\":{\n" +
                "      \"#\":\"520\",\n" +
                "      \"Attack\":\"77\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"62\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"42\",\n" +
                "      \"Species\":\"Wild Pigeon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"358\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Trapinch\":{\n" +
                "      \"#\":\"328\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Ant Pit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"10\",\n" +
                "      \"Total\":\"290\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Treecko\":{\n" +
                "      \"#\":\"252\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Wood Gecko Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"310\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Trevenant\":{\n" +
                "      \"#\":\"709\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"76\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"82\",\n" +
                "      \"Species\":\"Elder Tree Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"56\",\n" +
                "      \"Total\":\"474\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tropius\":{\n" +
                "      \"#\":\"357\",\n" +
                "      \"Attack\":\"68\",\n" +
                "      \"Defense\":\"83\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"99\",\n" +
                "      \"Sp. Atk\":\"72\",\n" +
                "      \"Sp. Def\":\"87\",\n" +
                "      \"Species\":\"Fruit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"51\",\n" +
                "      \"Total\":\"460\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Trubbish\":{\n" +
                "      \"#\":\"568\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"62\",\n" +
                "      \"FlavorText\":\"Inhaling the gas they belch will make you sleep for a week. They prefer unsanitary places.\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"62\",\n" +
                "      \"Species\":\"Trash Bag Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"329\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Turtwig\":{\n" +
                "      \"#\":\"387\",\n" +
                "      \"Attack\":\"68\",\n" +
                "      \"Defense\":\"64\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Tiny Leaf Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"31\",\n" +
                "      \"Total\":\"318\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tympole\":{\n" +
                "      \"#\":\"535\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Tadpole Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"64\",\n" +
                "      \"Total\":\"294\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tynamo\":{\n" +
                "      \"#\":\"602\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"EleFish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"275\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Typhlosion\":{\n" +
                "      \"#\":\"157\",\n" +
                "      \"Attack\":\"84\",\n" +
                "      \"Defense\":\"78\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"78\",\n" +
                "      \"Sp. Atk\":\"109\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Volcano Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"534\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tyranitar\":{\n" +
                "      \"#\":\"248\",\n" +
                "      \"Attack\":\"134\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Armor Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"61\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tyranitar ( Mega  Tyranitar )\":{\n" +
                "      \"#\":\"248\",\n" +
                "      \"Attack\":\"164\",\n" +
                "      \"Defense\":\"150\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"71\",\n" +
                "      \"Total\":\"700\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tyrantrum\":{\n" +
                "      \"#\":\"697\",\n" +
                "      \"Attack\":\"121\",\n" +
                "      \"Defense\":\"119\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"82\",\n" +
                "      \"Sp. Atk\":\"69\",\n" +
                "      \"Sp. Def\":\"59\",\n" +
                "      \"Species\":\"Despot Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"71\",\n" +
                "      \"Total\":\"521\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tyrogue\":{\n" +
                "      \"#\":\"236\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"35\",\n" +
                "      \"Sp. Atk\":\"35\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Scuffle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"35\",\n" +
                "      \"Total\":\"210\",\n" +
                "      \"Type\":[\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Tyrunt\":{\n" +
                "      \"#\":\"696\",\n" +
                "      \"Attack\":\"89\",\n" +
                "      \"Defense\":\"77\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"58\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Royal Heir Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"48\",\n" +
                "      \"Total\":\"362\",\n" +
                "      \"Type\":[\n" +
                "         \"Rock\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Umbreon\":{\n" +
                "      \"#\":\"197\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"110\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"Moonlight Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Unfezant\":{\n" +
                "      \"#\":\"521\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Proud Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"93\",\n" +
                "      \"Total\":\"488\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Unown\":{\n" +
                "      \"#\":\"201\",\n" +
                "      \"Attack\":\"72\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"48\",\n" +
                "      \"Sp. Atk\":\"72\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Symbol Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"48\",\n" +
                "      \"Total\":\"336\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Ursaring\":{\n" +
                "      \"#\":\"217\",\n" +
                "      \"Attack\":\"130\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"In forests, it is said that there are many streams and towering trees where an URSARING gathers food. It walks through its forest collecting food every day.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Hibernator Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Uxie\":{\n" +
                "      \"#\":\"480\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"130\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"130\",\n" +
                "      \"Species\":\"Knowledge Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vanillish\":{\n" +
                "      \"#\":\"583\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"51\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Icy Snow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"59\",\n" +
                "      \"Total\":\"395\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vanillite\":{\n" +
                "      \"#\":\"582\",\n" +
                "      \"Attack\":\"50\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"36\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Fresh Snow Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"44\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vanilluxe\":{\n" +
                "      \"#\":\"584\",\n" +
                "      \"Attack\":\"95\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"71\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Snowstorm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"79\",\n" +
                "      \"Total\":\"535\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vaporeon\":{\n" +
                "      \"#\":\"134\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"130\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"Bubble Jet Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Venipede\":{\n" +
                "      \"#\":\"543\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"59\",\n" +
                "      \"FlavorText\":\"Its bite injects a potent poison, enough to paralyze large bird Pok\\u00e9mon that try to prey on it.\",\n" +
                "      \"HP\":\"30\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"39\",\n" +
                "      \"Species\":\"Centipede Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"57\",\n" +
                "      \"Total\":\"260\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Venomoth\":{\n" +
                "      \"#\":\"049\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"The scales it scatters will paralyze anyone who touches them, making that person unable to stand.\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Poison Moth Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"450\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Venonat\":{\n" +
                "      \"#\":\"048\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"The small bugs it eats appear only at night, so it sleeps in a hole in a tree until night falls.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Insect Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"305\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Venusaur\":{\n" +
                "      \"#\":\"003\",\n" +
                "      \"Attack\":\"82\",\n" +
                "      \"Defense\":\"83\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Seed Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"525\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Venusaur ( Mega  Venusaur )\":{\n" +
                "      \"#\":\"003\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"123\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"122\",\n" +
                "      \"Sp. Def\":\"120\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"80\",\n" +
                "      \"Total\":\"625\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vespiquen\":{\n" +
                "      \"#\":\"416\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"102\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"102\",\n" +
                "      \"Species\":\"Beehive Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"40\",\n" +
                "      \"Total\":\"474\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vibrava\":{\n" +
                "      \"#\":\"329\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"50\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Vibration Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"340\",\n" +
                "      \"Type\":[\n" +
                "         \"Ground\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Victini\":{\n" +
                "      \"#\":\"494\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"100\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Victory Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Victreebel\":{\n" +
                "      \"#\":\"071\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"Once ingested into this POK\\u00e9MON's body, even the hardest object will melt into nothing.\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"100\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Flycatcher Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vigoroth\":{\n" +
                "      \"#\":\"288\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Wild Monkey Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"440\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vileplume\":{\n" +
                "      \"#\":\"045\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"110\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Flower Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Virizion\":{\n" +
                "      \"#\":\"640\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"72\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"91\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"129\",\n" +
                "      \"Species\":\"Grassland Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"108\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Fighting\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vivillon\":{\n" +
                "      \"#\":\"666\",\n" +
                "      \"Attack\":\"52\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Scale Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"89\",\n" +
                "      \"Total\":\"411\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Volbeat\":{\n" +
                "      \"#\":\"313\",\n" +
                "      \"Attack\":\"73\",\n" +
                "      \"Defense\":\"55\",\n" +
                "      \"FlavorText\":\"With their taillights lit, VOLBEAT fly in a swarm, drawing geometric designs in the night sky. They move their nests if their pond water becomes dirty.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"47\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Firefly Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"400\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Volcanion\":{\n" +
                "      \"#\":\"721\",\n" +
                "      \"Attack\":\"110\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"80\",\n" +
                "      \"Sp. Atk\":\"130\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Steam Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"70\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Volcarona\":{\n" +
                "      \"#\":\"637\",\n" +
                "      \"Attack\":\"60\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"85\",\n" +
                "      \"Sp. Atk\":\"135\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"Sun Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"550\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Voltorb\":{\n" +
                "      \"#\":\"100\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"55\",\n" +
                "      \"Species\":\"Ball Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vullaby\":{\n" +
                "      \"#\":\"629\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"75\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Diapered Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"370\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Vulpix\":{\n" +
                "      \"#\":\"037\",\n" +
                "      \"Attack\":\"41\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"38\",\n" +
                "      \"Sp. Atk\":\"50\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"299\",\n" +
                "      \"Type\":[\n" +
                "         \"Fire\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wailmer\":{\n" +
                "      \"#\":\"320\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"130\",\n" +
                "      \"Sp. Atk\":\"70\",\n" +
                "      \"Sp. Def\":\"35\",\n" +
                "      \"Species\":\"Ball Whale Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"400\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wailord\":{\n" +
                "      \"#\":\"321\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"170\",\n" +
                "      \"Sp. Atk\":\"90\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Float Whale Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"500\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Walrein\":{\n" +
                "      \"#\":\"365\",\n" +
                "      \"Attack\":\"80\",\n" +
                "      \"Defense\":\"90\",\n" +
                "      \"FlavorText\":\"To protect its herd, the leader battles anything that invades its territory, even at the cost of its life. Its tusks may snap off in battle.\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Ice Break Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"530\",\n" +
                "      \"Type\":[\n" +
                "         \"Ice\",\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wartortle\":{\n" +
                "      \"#\":\"008\",\n" +
                "      \"Attack\":\"63\",\n" +
                "      \"Defense\":\"80\",\n" +
                "      \"FlavorText\":\"Its long, furry tail is a symbol of longevity, making it quite popular among older people.\",\n" +
                "      \"HP\":\"59\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"80\",\n" +
                "      \"Species\":\"Turtle Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Watchog\":{\n" +
                "      \"#\":\"505\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"69\",\n" +
                "      \"FlavorText\":\"When they see an enemy, their tails stand high, and they spit the seeds of berries stored in their cheek pouches.\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"69\",\n" +
                "      \"Species\":\"Lookout Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"77\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Weavile\":{\n" +
                "      \"#\":\"461\",\n" +
                "      \"Attack\":\"120\",\n" +
                "      \"Defense\":\"65\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"70\",\n" +
                "      \"Sp. Atk\":\"45\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"Sharp Claw Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"125\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Ice\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Weedle\":{\n" +
                "      \"#\":\"013\",\n" +
                "      \"Attack\":\"35\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"The barb on top of its head secretes a strong poison. It uses this toxic barb to protect itself.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"20\",\n" +
                "      \"Species\":\"Hairy Bug Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"50\",\n" +
                "      \"Total\":\"195\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Weepinbell\":{\n" +
                "      \"#\":\"070\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"50\",\n" +
                "      \"FlavorText\":\"When it's hungry, it swings its razor-sharp leaves, slicing up any unlucky object nearby for food.\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Flycatcher Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Weezing\":{\n" +
                "      \"#\":\"110\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Poison Gas Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"490\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Whimsicott\":{\n" +
                "      \"#\":\"547\",\n" +
                "      \"Attack\":\"67\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"77\",\n" +
                "      \"Sp. Def\":\"75\",\n" +
                "      \"Species\":\"Windveiled Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"116\",\n" +
                "      \"Total\":\"480\",\n" +
                "      \"Type\":[\n" +
                "         \"Grass\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Whirlipede\":{\n" +
                "      \"#\":\"544\",\n" +
                "      \"Attack\":\"55\",\n" +
                "      \"Defense\":\"99\",\n" +
                "      \"FlavorText\":\"It is usually motionless, but when attacked, it rotates at high speed and then crashes into its opponent.\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"40\",\n" +
                "      \"Sp. Def\":\"79\",\n" +
                "      \"Species\":\"Curlipede Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"47\",\n" +
                "      \"Total\":\"360\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Poison\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Whiscash\":{\n" +
                "      \"#\":\"340\",\n" +
                "      \"Attack\":\"78\",\n" +
                "      \"Defense\":\"73\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"110\",\n" +
                "      \"Sp. Atk\":\"76\",\n" +
                "      \"Sp. Def\":\"71\",\n" +
                "      \"Species\":\"Whiskers Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"468\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Whismur\":{\n" +
                "      \"#\":\"293\",\n" +
                "      \"Attack\":\"51\",\n" +
                "      \"Defense\":\"23\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"64\",\n" +
                "      \"Sp. Atk\":\"51\",\n" +
                "      \"Sp. Def\":\"23\",\n" +
                "      \"Species\":\"Whisper Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"28\",\n" +
                "      \"Total\":\"240\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wigglytuff\":{\n" +
                "      \"#\":\"040\",\n" +
                "      \"Attack\":\"70\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"140\",\n" +
                "      \"Sp. Atk\":\"85\",\n" +
                "      \"Sp. Def\":\"50\",\n" +
                "      \"Species\":\"Balloon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"45\",\n" +
                "      \"Total\":\"435\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\",\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wingull\":{\n" +
                "      \"#\":\"278\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"30\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Seagull Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"85\",\n" +
                "      \"Total\":\"270\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wobbuffet\":{\n" +
                "      \"#\":\"202\",\n" +
                "      \"Attack\":\"33\",\n" +
                "      \"Defense\":\"58\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"190\",\n" +
                "      \"Sp. Atk\":\"33\",\n" +
                "      \"Sp. Def\":\"58\",\n" +
                "      \"Species\":\"Patient Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"33\",\n" +
                "      \"Total\":\"405\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Woobat\":{\n" +
                "      \"#\":\"527\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"43\",\n" +
                "      \"FlavorText\":\"The heart-shaped mark left on a body after a Woobat has been attached to it is said to bring good fortune.\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"43\",\n" +
                "      \"Species\":\"Bat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"72\",\n" +
                "      \"Total\":\"313\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wooper\":{\n" +
                "      \"#\":\"194\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"55\",\n" +
                "      \"Sp. Atk\":\"25\",\n" +
                "      \"Sp. Def\":\"25\",\n" +
                "      \"Species\":\"Water Fish Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"15\",\n" +
                "      \"Total\":\"210\",\n" +
                "      \"Type\":[\n" +
                "         \"Water\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wormadam ( Plant  Cloak )\":{\n" +
                "      \"#\":\"413\",\n" +
                "      \"Attack\":\"59\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"79\",\n" +
                "      \"Sp. Def\":\"105\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"36\",\n" +
                "      \"Total\":\"424\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Grass\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wormadam ( Sandy  Cloak )\":{\n" +
                "      \"#\":\"413\",\n" +
                "      \"Attack\":\"79\",\n" +
                "      \"Defense\":\"105\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"59\",\n" +
                "      \"Sp. Def\":\"85\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"36\",\n" +
                "      \"Total\":\"424\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wormadam ( Trash  Cloak )\":{\n" +
                "      \"#\":\"413\",\n" +
                "      \"Attack\":\"69\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"69\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"36\",\n" +
                "      \"Total\":\"424\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Steel\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wurmple\":{\n" +
                "      \"#\":\"265\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"Often targeted by bird Pok\\u00e9mon, it desperately resists by releasing poison from its tail spikes.\",\n" +
                "      \"HP\":\"45\",\n" +
                "      \"Sp. Atk\":\"20\",\n" +
                "      \"Sp. Def\":\"30\",\n" +
                "      \"Species\":\"Worm Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"20\",\n" +
                "      \"Total\":\"195\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Wynaut\":{\n" +
                "      \"#\":\"360\",\n" +
                "      \"Attack\":\"23\",\n" +
                "      \"Defense\":\"48\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"95\",\n" +
                "      \"Sp. Atk\":\"23\",\n" +
                "      \"Sp. Def\":\"48\",\n" +
                "      \"Species\":\"Bright Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"23\",\n" +
                "      \"Total\":\"260\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Xatu\":{\n" +
                "      \"#\":\"178\",\n" +
                "      \"Attack\":\"75\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"95\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Mystic Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"470\",\n" +
                "      \"Type\":[\n" +
                "         \"Psychic\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Xerneas\":{\n" +
                "      \"#\":\"716\",\n" +
                "      \"Attack\":\"131\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"126\",\n" +
                "      \"Sp. Atk\":\"131\",\n" +
                "      \"Sp. Def\":\"98\",\n" +
                "      \"Species\":\"Life Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"99\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Fairy\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Yamask\":{\n" +
                "      \"#\":\"562\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"38\",\n" +
                "      \"Sp. Atk\":\"55\",\n" +
                "      \"Sp. Def\":\"65\",\n" +
                "      \"Species\":\"Spirit Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"30\",\n" +
                "      \"Total\":\"303\",\n" +
                "      \"Type\":[\n" +
                "         \"Ghost\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Yanma\":{\n" +
                "      \"#\":\"193\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"45\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"65\",\n" +
                "      \"Sp. Atk\":\"75\",\n" +
                "      \"Sp. Def\":\"45\",\n" +
                "      \"Species\":\"Clear Wing Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"390\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Yanmega\":{\n" +
                "      \"#\":\"469\",\n" +
                "      \"Attack\":\"76\",\n" +
                "      \"Defense\":\"86\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"86\",\n" +
                "      \"Sp. Atk\":\"116\",\n" +
                "      \"Sp. Def\":\"56\",\n" +
                "      \"Species\":\"Ogre Darner Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"515\",\n" +
                "      \"Type\":[\n" +
                "         \"Bug\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Yveltal\":{\n" +
                "      \"#\":\"717\",\n" +
                "      \"Attack\":\"131\",\n" +
                "      \"Defense\":\"95\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"126\",\n" +
                "      \"Sp. Atk\":\"131\",\n" +
                "      \"Sp. Def\":\"98\",\n" +
                "      \"Species\":\"Destruction Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"99\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zangoose\":{\n" +
                "      \"#\":\"335\",\n" +
                "      \"Attack\":\"115\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"When it battles, it stands on its hind legs and attacks with its sharply clawed forelegs. Its fur bristles if it encounters any SEVIPER.\",\n" +
                "      \"HP\":\"73\",\n" +
                "      \"Sp. Atk\":\"60\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Cat Ferret Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"458\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zapdos\":{\n" +
                "      \"#\":\"145\",\n" +
                "      \"Attack\":\"90\",\n" +
                "      \"Defense\":\"85\",\n" +
                "      \"FlavorText\":\"Legendary bird POK\\u00e9MON. They say lightning caused by the flapping of its wings causes summer storms.\",\n" +
                "      \"HP\":\"90\",\n" +
                "      \"Sp. Atk\":\"125\",\n" +
                "      \"Sp. Def\":\"90\",\n" +
                "      \"Species\":\"Electric Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"100\",\n" +
                "      \"Total\":\"580\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zebstrika\":{\n" +
                "      \"#\":\"523\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"63\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"75\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"63\",\n" +
                "      \"Species\":\"Thunderbolt Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"116\",\n" +
                "      \"Total\":\"497\",\n" +
                "      \"Type\":[\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zekrom\":{\n" +
                "      \"#\":\"644\",\n" +
                "      \"Attack\":\"150\",\n" +
                "      \"Defense\":\"120\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"100\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"100\",\n" +
                "      \"Species\":\"Deep Black Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"90\",\n" +
                "      \"Total\":\"680\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Electric\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zigzagoon\":{\n" +
                "      \"#\":\"263\",\n" +
                "      \"Attack\":\"30\",\n" +
                "      \"Defense\":\"41\",\n" +
                "      \"FlavorText\":\"Rubbing its nose against the ground, it always wanders about back and forth in search of something. It is distinguished by the zigzag footprints it leaves.\",\n" +
                "      \"HP\":\"38\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"41\",\n" +
                "      \"Species\":\"TinyRaccoon Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"60\",\n" +
                "      \"Total\":\"240\",\n" +
                "      \"Type\":[\n" +
                "         \"Normal\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zoroark\":{\n" +
                "      \"#\":\"571\",\n" +
                "      \"Attack\":\"105\",\n" +
                "      \"Defense\":\"60\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"60\",\n" +
                "      \"Sp. Atk\":\"120\",\n" +
                "      \"Sp. Def\":\"60\",\n" +
                "      \"Species\":\"Illusion Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"105\",\n" +
                "      \"Total\":\"510\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zorua\":{\n" +
                "      \"#\":\"570\",\n" +
                "      \"Attack\":\"65\",\n" +
                "      \"Defense\":\"40\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"80\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Tricky Fox Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"65\",\n" +
                "      \"Total\":\"330\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zubat\":{\n" +
                "      \"#\":\"041\",\n" +
                "      \"Attack\":\"45\",\n" +
                "      \"Defense\":\"35\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"40\",\n" +
                "      \"Sp. Atk\":\"30\",\n" +
                "      \"Sp. Def\":\"40\",\n" +
                "      \"Species\":\"Bat Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"55\",\n" +
                "      \"Total\":\"245\",\n" +
                "      \"Type\":[\n" +
                "         \"Poison\",\n" +
                "         \"Flying\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zweilous\":{\n" +
                "      \"#\":\"634\",\n" +
                "      \"Attack\":\"85\",\n" +
                "      \"Defense\":\"70\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"72\",\n" +
                "      \"Sp. Atk\":\"65\",\n" +
                "      \"Sp. Def\":\"70\",\n" +
                "      \"Species\":\"Hostile Pok\\u00e9mon\",\n" +
                "      \"Speed\":\"58\",\n" +
                "      \"Total\":\"420\",\n" +
                "      \"Type\":[\n" +
                "         \"Dark\",\n" +
                "         \"Dragon\"\n" +
                "      ]\n" +
                "   },\n" +
                "   \"Zygarde50% (  Forme )\":{\n" +
                "      \"#\":\"718\",\n" +
                "      \"Attack\":\"100\",\n" +
                "      \"Defense\":\"121\",\n" +
                "      \"FlavorText\":\"\",\n" +
                "      \"HP\":\"108\",\n" +
                "      \"Sp. Atk\":\"81\",\n" +
                "      \"Sp. Def\":\"95\",\n" +
                "      \"Species\":\"\",\n" +
                "      \"Speed\":\"95\",\n" +
                "      \"Total\":\"600\",\n" +
                "      \"Type\":[\n" +
                "         \"Dragon\",\n" +
                "         \"Ground\"\n" +
                "      ]\n" +
                "   }\n" +
                "}";

        static class Pokemon {
            String name, num, attack, defense, flav, hp, spatk, spdef, species, speed, total;
            ArrayList<String> type;

            public Pokemon(String name, String num, String attack, String defense, String flav, String hp, String spatk, String spdef, String species, String speed, String total, ArrayList<String> type) {
                this.name = name;
                this.num = num;
                this.attack = attack;
                this.defense = defense;
                this.flav = flav;
                this.hp = hp;
                this.spatk = spatk;
                this.spdef = spdef;
                this.species = species;
                this.speed = speed;
                this.total = total;
                this.type = type;
            }
        }
    }
*/