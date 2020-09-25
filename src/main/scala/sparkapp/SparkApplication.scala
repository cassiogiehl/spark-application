package sparkapp

import org.apache.spark.{SparkConf, SparkContext}

object SparkApplication {
  def main(args: Array[String]): Unit = {

    // Configurando o spark
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("First Application")

    // Criando um contexto spark passando a configuração como parâmetro
    val sc = new SparkContext(conf)

    // RDD simples pra ver que funciona
    val rdd1 = sc.makeRDD(Array(1, 2, 3, 4, 5, 6))
    rdd1.collect().foreach(println)
  }
}
