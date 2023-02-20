package ch11;

public class AnimalMainTest2 {

	public static void main(String[] args) {

		// Human human = new Human();
		// 다형성을 적용하게 된다면 부모타입으로 데이터 타입을 선언 할수있고
		// 실제 메모리에 올라가는 객체를 다형이 적용되는 클래스를 인스턴스화 할수있다
		Animal animalH = new Human();
		Animal animalT = new Tiger();

		Animal[] arrAnimal = new Animal[10];
		arrAnimal[0] = animalH;
		arrAnimal[1] = animalT;

		for (int i = 0; i < arrAnimal.length; i++) {
			if (arrAnimal[i] != null) {
				arrAnimal[i].move();
				arrAnimal[i].eating();

			}
		}

	}

}
