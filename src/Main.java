import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import testMoshi.MoshiCompany;
import testgson.GsonCompany;
import testjackson.JacksonCompany;

public class Main {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("test.json");
		String json = Files.readString(path);
		
		long startTime;
		long endTime;
		
		// Gson
		Gson gson = new Gson();
		startTime = System.currentTimeMillis();
		GsonCompany gsonCompany = gson.fromJson(json, GsonCompany.class);
		System.out.println("gson:" + gsonCompany);
		endTime = System.currentTimeMillis();
		System.out.println("処理時間：" + (endTime - startTime) + " ms");

		// Jackson
		ObjectMapper mapper = new ObjectMapper();
		startTime = System.currentTimeMillis();
		JacksonCompany jacksonCompany = mapper.readValue(json, JacksonCompany.class);
		System.out.println("jackson:" + jacksonCompany);
		endTime = System.currentTimeMillis();
		System.out.println("処理時間：" + (endTime - startTime) + " ms");

		// Moshi
		Moshi moshi = new Moshi.Builder().build();
		JsonAdapter<MoshiCompany> jsonAdapter = moshi.adapter(MoshiCompany.class);
		startTime = System.currentTimeMillis();
		MoshiCompany moshiCompany = jsonAdapter.fromJson(json);
		System.out.println("moshi:" + moshiCompany);
		endTime = System.currentTimeMillis();
		System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}

}
