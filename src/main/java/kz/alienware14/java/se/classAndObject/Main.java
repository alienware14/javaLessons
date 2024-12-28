package kz.alienware14.java.se.classAndObject;

/***
 * Class  және Object түсінік
 */
public class Main {

}

/*** Бұл class - class бір нәрсені жобалау үшін керек
 * Class айнымалылар(fields(өрістер)) мен әдістерден(Methods) тұрады

 * Car деген class-ты көлікті жобалау үшін құрдым
 *
 */
class Car{


    // Бұл айнымалылар(Fields(өрістер))
    /* Айнымалылар мәнді сақтау үшін керек, кейін қайта қолдану үшін
    * Мәндерге мысалы көліктін: model түрі, түсі, жаңармай шығыны, жаңармай сыйымдылығы,
    * жаңармай деңгейі жатады осы аталып өткендердің бәрінде бір мәні бар
    * және оларды сақтау керек сосын қолдану үшін пайдалану керек
    * ал оларды біз әдіс(Method) ішінде пайдаланамыз*/
    String model;
    String color;
    double fuelConsumption;
    int volume;
    int fuelLevel;

    // Бұл әдіс(Method)
    /* Әдістер айнамалылардағы ақпараттарды басқарып бір жүйеге келтіру үшін керек
    * Мысалы: көлік қозғалу үшін жаңармайды қолданады  дәл осы жерде әдіс көрінеді
    * яғни бұл ойластырылған бір әдіс: жаңармайдын жануы одан бөлініп
    * шыққан өттегі көлікті қозғау үшін ойлап табылған: қортынды әдісті
    * біз бір идеяны ойлап тауып оны бір жүйеге келтіру үшін қолданамыз*/
    void move(int x1, int y1, int x2, int y2){
        // Осы жерде неше киллометр жүргенің есептейміз
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Осы жерде 100киллометрден кейін неше жаңармай қолданғаның есептейміз
        fuelLevel = (int)(fuelLevel - path / 100 * fuelConsumption);
        if(fuelLevel < 0) {
            System.out.println(model + " көлігі мәреге жетпеді, жаңармай таусылды!!!");
            fuelLevel = 0;
        }
        else {
            System.out.printf("%s көлігі жүріп өтті: 0%sкм, осынша жаңармай қалды: %sл\n",model, path, fuelLevel);
        }
    }

    void refuel(int liters){
        fuelLevel = fuelLevel + liters;
        if(fuelLevel > volume){
            System.out.println("Жаңармай толдып кетті.");
            fuelLevel = volume;
        }else {
            System.out.println("Жаңармай толтырылды, еңді сізде "+fuelLevel+"л");
        }
    }

    public static void main(String[] args){
        // Бұл Object - Class арқылы ойдан жобаланған затты өңдіріп шығару
        // мысалы: мен көліктін қалай болуы керегін жобалаған едім еңді
        // 1дана Mercedes көлігін өңдіріп шығардым
        // және өзім жазған move әдісі арқылы неше киллометр жүргенің есептедім
        Car car1 = new Car();
        car1.model = "Mercedes";
        car1.color = "Ақ";
        car1.volume = 45; // 45л жаңармай сыйады
        car1.fuelLevel = 15; // дәл қазір 15л жаңармай бар
        car1.fuelConsumption = 8; // 100 киллометр үшін 8л жаңармай қолданады
        car1.move(10,10, 100, 100);

        // Тағы бір көлікті өңдіріп шығару
        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.color = "Қара";
        bmw.volume = 60; // 60л жаңармай сыйады
        bmw.fuelLevel = 60; // дәл қазір 60л жаңармай бар
        bmw.fuelConsumption = 12; // 100 киллометр үшін 12л жаңармай қолданады
        //bmw.move(10,10, 100, 100);
        bmw.move(0,0, 500, 300);
        bmw.refuel(50); // Жаңармай толтыру
        bmw.move(150, 150, 500, 300); //
    }
}
