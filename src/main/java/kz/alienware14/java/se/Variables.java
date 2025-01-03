package kz.alienware14.java.se;

// Айнымалы түрлері
public class Variables {
    /*
     * Java Variables(айнымалылары) ----
     * Мен (Variable) деген сөзді алдығы уақытта (Айнымалы) деп атайтын боламын
     *
     * Айнымалы Java бағдарламасы орындалған кезде мәнді сақтайдын контайнер болып табылады.
     * Айнымалы data type(деректер түрі)-мен тағайындалады.
     *
     * Айнымалы - жад(Память) мекен-жайының атауы
     * Java-да айнымалылардың 3 түрі бар: жергілікті(local), даңалық(instance), және статикалық(static)
     *
     * Java-да деректер түрлерінің 2 түрі бар: primitive(Қарапайым) және non-primitive(қарапайым-емес).
     * */
    // Айнымалыны жариялау және мәнің тағайындау үлгісі ---
    // ( дерек түрі      айнымалы аты   =     мәні )
    //      int             num         =      10; // Бұл жерде деректер түрі сандық болатын айнымалы
    int num = 10;
    float sum = 10.23f;

    //Айнымалы түрлері:

    /*
     * Java тілінде айнымалыларлың 3 түрі бар:
     * 1) local variable (жергілікті айнымалы)
     * 2) instance variable (даңалық айнымалы)
     * 3) static variable (статикалық айнымалы)
     * */

    /*
     * 1) Local variable(Жергілікті айнымалы)
     * Method(Әдіс)-тің негізгі бөлігінде жарияланған айнымалы
     * local variables(жергілікті айнымалы) деп аталады
     * Сіз бұл айнымалыны тек сол Method(Әдіс) ішінде пайдалана аласыз және
     * class(сынып)-тағы басқа method(әдіс)-тер айнымалының бар екенің білмейді.
     *
     * Local variable(Жергілікті айнымалы)-ны static(статикалық) кілт сөзімен аңықтай мүмкін емес.
     * */

    /*
     * 2) Instance variable(Дана айнымалы)-сы
     *  Class(сынып) ішінде жарияланған, бірақ method(әдіс) денесінің сыртында жарияланған айнымалы
     * instance(дана) айнымалы деп аталыды.
     * Ол static кілт сөзін қолданбаған кезде ғана дана айнымалы болады
     * себебі ол әр class-тын object(нысан)-дары үшін ғана мәндерді сақтайды
     * яғни 1 object(нысан) 2-ші object(нысан)-ның мәнінең тәуелсіз болады
     * */

    /*
     * 3) Static айнымалы
     * static кілт сөзін қолданып жарияланған айнымалы  static айнымалы деп аталады.
     * Бұл local(жергілік) айнымалысы болуы мүмкін емес.  Сіз static айнымалысын жариялаған кезде
     * ол class-қа тиесілі айнымалы болады яғни class-та қаңша (Method)әдіс
     * болса солардың бәріне ортақ айнымалы болады және class-тың ішіндегі
     * бір (method)әдіс static айнымалының мәнің өзгертетің болса
     * ол барлық (Method)әдіске әсер етеді яғни бардық (Methods)әдістерге мәні бірдей өзгеріп кетеді
     *
     * Static айнымалылар үшін жадты бөлу class жадқа жүктелген кезде болады.
     * */
}
// Java тіліндегі айнымалылардың түрлерін түсінуге мысал:

// Class (Сынып)
class A{
    static  int staticVariable = 100; // Static variable (статик айнымалы)
    int instanceVariable = 100; // instance variable (дана айнымалы)

    // Method (әдіс)
    void method(){
        int localVariable = 100; // local variable (жергілікті айнымалы)
    }
}