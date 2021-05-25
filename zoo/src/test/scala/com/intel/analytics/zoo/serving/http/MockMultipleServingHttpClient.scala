/*
 * Copyright 2018 Analytics Zoo Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.intel.analytics.zoo.serving.http

import java.util.concurrent.TimeUnit

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.stream.ActorMaterializer
import akka.util.Timeout
import org.slf4j.LoggerFactory

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object MockMultipleServingHttpClient extends App with Supportive {

  override val logger = LoggerFactory.getLogger(getClass)
  // load various model
  testCaffe()
  testBigDL()

  def testCaffe() : Unit = {
    val resource = getClass().getClassLoader().getResource("models")
    //loads
    val modelPath = resource.getPath + "/caffe/test_persist.prototxt"
    val weightPath = resource.getPath + "/caffe/test_persist.caffemodel"
    val inferenceModelMetaData = InferenceModelMetaData("caffe", "1.0", modelPath, "Caffe", weightPath, null)

    val inferenceServable = new InferenceModelServable(inferenceModelMetaData)
    inferenceServable.load()
    val instance = JsonUtil.fromJson(classOf[Instances], content)
    inferenceServable.predict(instance)
  }

  def testBigDL() : Unit = {
    val resource = getClass().getClassLoader().getResource("models")
    //loads
    val modelPath = resource.getPath + "/caffe/test_persist.prototxt"
    val weightPath = resource.getPath + "/caffe/test_persist.caffemodel"
    val inferenceModelMetaData = InferenceModelMetaData("caffe", "1.0", modelPath, "Caffe", weightPath, null)

    val inferenceServable = new InferenceModelServable(inferenceModelMetaData)
    inferenceServable.load()
  }

}
