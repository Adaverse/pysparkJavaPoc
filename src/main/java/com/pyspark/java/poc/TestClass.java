package com.pyspark.java.poc;

import org.apache.spark.SparkContext;
import org.apache.spark.sql.*;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.Row;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public void printString(String input) {
        System.out.println(input);
    }

    public Integer getSum(Integer a, Integer b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public Dataset<Row> checkDatasetRow(SparkSession spark) {
        StructType structType = new StructType();
        structType = structType.add("A", DataTypes.StringType, false);
        structType = structType.add("B", DataTypes.StringType, false);
        List<Row> nums = new ArrayList<>();
        nums.add(RowFactory.create("value1", "value2"));
        Dataset<Row> df = spark.createDataFrame(nums, structType);
        df.printSchema();
        return df;
    }

    public void processData(SparkSession spark, Dataset<Row> dataset) {
        System.out.println("I'm in this function ******************");
        System.out.println(dataset);
        dataset.show();
    }

//    public void processData(SparkSession spark, StructType structType) {
//        System.out.println(structType);
//    }

}
