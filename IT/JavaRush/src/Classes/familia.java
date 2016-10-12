package Classes;
/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class familia {
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grFather1 = new Human("Иван", true, 84);
        Human grFather2 = new Human("Петр", true,82);
        Human grMother1 = new Human("Любовь", false,83);
        Human grMother2 = new Human("Вера", false,83);

        Human father = new Human("Саша", true, 48, grFather1,grMother1);
        Human mother = new Human("Маша", false, 33, grFather2,grMother2);

        Human child1 = new Human("Urii", true, 15, father,mother);
        Human child2 = new Human("Mi", false, 10, father,mother);
        Human child3 = new Human("Roma", true, 3, father,mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grFather1);
        System.out.println(grMother1);
        System.out.println(grFather2);
        System.out.println(grMother2);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        //напишите тут ваш код
        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            toString();

        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            toString();

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
