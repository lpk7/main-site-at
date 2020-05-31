package ru.geekbrains.main.site.at.junit.example.hamcrest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class StringHamcrestTest {

    @DisplayName("Проверка строк без учета регистра")
    @Test
    public void given2Strings_whenEqual_thenCorrect() {
        String nameActual = "Petya";
        String nameExpected = "petya";
        assertThat(nameActual, equalToIgnoringCase(nameExpected));
    }

    @DisplayName("Проверка строк без учета пробелов в стоке")
//    В начале и в конце строки пробелы удаляются, а в середине все подряд идущие пробелы сводятся к одному:
    @Test
    public void given2Strings_whenEqualIgnWS_thenCorrect() {
        String a = "  Hi   Petya ";
        assertThat(a, equalToCompressingWhiteSpace("Hi Petya"));
    }
}
