package com.coffee.servlet;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.coffee.DB.DB;
import com.coffee.entity.Student;
import com.coffee.web.restful.RestfulDo;
import com.google.gson.JsonObject;



public class StudentListDo extends RestfulDo
{

	@Override
	public Object execute(JsonObject jreq) throws Exception
	{
		return DB.query("select * from student", 0);
	}

}
