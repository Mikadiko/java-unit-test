@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("если пользователю 18 лет или больше ", expected, isAdult);// Напиши код здесь
}
