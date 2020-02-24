package kail.study.java.enumStudy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaleMoneyTest {
	@Test
	void sales() {
		long originMoney = 10000L;
		assertThat(
			SaleMoney.ORIGIN.calculate(originMoney)
		).isEqualTo(10000L);

		assertThat(
			SaleMoney.VAT.calculate(originMoney)
		).isEqualTo(10000L / 11);

		assertThat(
			SaleMoney.SUPPLY.calculate(originMoney)
		).isEqualTo(10000L * 10 / 11);

		assertThat(
			SaleMoney.NOTHING.calculate(originMoney)
		).isEqualTo(0L);
	}
}