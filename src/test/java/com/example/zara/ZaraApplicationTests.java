package com.example.zara;



import static org.assertj.core.api.Assertions.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZaraApplicationTests {

	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
	@Autowired PricesRepository pricesRepo;
	
	@Test
	void test1() throws Exception {
		Date date1 = df.parse("2020-06-14 10.00.00");
		assertThat(this.pricesRepo.findByDate(date1).getPriceList() == 1);
	}
	@Test
	void test2() throws Exception {
		Date date1 = df.parse("2020-06-14 16.00.00");
		assertThat(this.pricesRepo.findByDate(date1).getPriceList() == 2);
	}
	@Test
	void test3() throws Exception {
		Date date1 = df.parse("2020-06-14 21.00.00");
		assertThat(this.pricesRepo.findByDate(date1).getPriceList() == 1);
	}
	@Test
	void test4() throws Exception {
		Date date1 = df.parse("2020-06-15 10.00.00");
		assertThat(this.pricesRepo.findByDate(date1).getPriceList() == 3);
	}
	@Test
	void test5() throws Exception {
		Date date1 = df.parse("2020-06-16 21.00.00");
		assertThat(this.pricesRepo.findByDate(date1).getPriceList() == 4);
	}
}
