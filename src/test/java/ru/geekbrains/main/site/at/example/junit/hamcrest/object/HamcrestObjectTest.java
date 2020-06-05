package ru.geekbrains.main.site.at.example.junit.hamcrest.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestObjectTest {

    @DisplayName("Проверка метода toString()")
    @Test
    public void givenDog_whenToString_thenReturnsSound() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasToString("gaf"));
    }

    @DisplayName("Проверка наследования")
    @Test
    public void givenSubclass_whenTypeCompatable_thenTrue() {
        assertThat(Dog.class, typeCompatibleWith(Animal.class));
        assertThat(Integer.class, typeCompatibleWith(Number.class));
    }

    @DisplayName("Проверка класса у объекта")
    @Test
    public void givenSubclass_whenChecked_thenTrue() {
        Dog dog = new Dog("gaf");
        assertThat(dog, instanceOf(Animal.class));
    }

    @DisplayName("Проверка указанной пременной у объекта")
    @Test
    public void givenBean__whenHasValue__thenCorrect() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasProperty("sound"));
    }

    @DisplayName("Проверка значения указанной пременной у объекта")
    @Test
    public void givenBean__whenHasCorrectValue__thenCorrect() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasProperty("sound", equalTo("gaf")));
    }

    @DisplayName("Сравнение значений у двух объектов")
    @Test
    public void given2Beans__whenHavingSameValues__thenCorrect() {
        Dog dog1 = new Dog("gaf");
        Dog dog2 = new Dog("gaf");
        assertThat(dog1, samePropertyValuesAs(dog2));
    }
}
