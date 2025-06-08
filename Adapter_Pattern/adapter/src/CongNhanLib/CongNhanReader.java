package CongNhanLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CongNhanReader {
	static public List<CongNhan> CongNhanList(String filename) throws IOException, ParseException  {
		var lst = new ArrayList<CongNhan>();

		var br = new BufferedReader(new FileReader(filename));
		while (true) {
			var line = br.readLine();
			if (line == null)
				break;

			var info = line.split(";");
			var Hoten = info[0];
			var NgayBD = info[1];
			
			var dmy = NgayBD.split("/");
			int d = Integer.parseInt(dmy[0]);
			int m = Integer.parseInt(dmy[1]);
			int y = Integer.parseInt(dmy[2]);
			var NgayVL = LocalDate.of(y, m, d);
			var x = new CongNhan(Hoten,NgayVL);


			lst.add(x);
		}
		br.close();
		return lst;
	}

}
