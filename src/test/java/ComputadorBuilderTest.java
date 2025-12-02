import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ComputadorBuilderTest {
    @Test
    void deveRetornarExcecaoParaComputadorSemProcessador() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMemoriaRAM(16)
                    .setArmazenamento("500GB SSD") // Campo opcional
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Processador é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorComMemoriaRAMInvalida() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setProcessador("Intel Core i5")
                    .setMemoriaRAM(0)
                    .setPlacaDeVideo("GTX 1660")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Memória RAM inválida (deve ser maior que 0)", e.getMessage());
        }
    }

    @Test
    void deveRetornarComputadorValidoComApenasCamposObrigatorios() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setProcessador("Processador Básico")
                .setMemoriaRAM(4)
                .build();

        assertNotNull(computador);
        assertEquals("Processador Básico", computador.getProcessador());
        assertEquals(4, computador.getMemoriaRAM());
        assertNull(computador.getPlacaDeVideo());
    }

    @Test
    void deveRetornarComputadorValidoComTodosOsCamposPreenchidos() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setProcessador("AMD Ryzen 7")
                .setMemoriaRAM(32)
                .setPlacaDeVideo("NVIDIA RTX 4080")
                .setArmazenamento("1TB NVMe SSD")
                .setFonteDeAlimentacao("850W Gold")
                .setGabinete("Mid Tower")
                .build();

        assertNotNull(computador);
        assertEquals("AMD Ryzen 7", computador.getProcessador());
        assertEquals(32, computador.getMemoriaRAM());
        assertEquals("NVIDIA RTX 4080", computador.getPlacaDeVideo());
        assertEquals("1TB NVMe SSD", computador.getArmazenamento());
    }
}
