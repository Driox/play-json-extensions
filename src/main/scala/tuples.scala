package ai.x.play.json.tuples
// Formatters for Scala tuples
// Autogenerated using codegen.sh
import _root_.play.api.libs.json._
object `package` {
  private def mergeErrors[T](
    results: Seq[JsResult[_]],
    success: => T
  ): JsResult[T] = {
    val errors = results.collect {
      case JsError( values ) => values
    }.flatten
    if ( errors.isEmpty ) {
      JsSuccess( success )
    } else JsError( errors )
  }

  implicit def formatTuple2[T1: Format, T2: Format]: Format[( T1, T2 )] = new Format[( T1, T2 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2 ) ) =>
        val ( r1, r2 ) =
          ( t1.validate[T1], t2.validate[T2] )
        mergeErrors(
          Seq( r1, r2 ),
          ( r1.get, r2.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 2, found: " + json ) )
    }
    def writes( t: ( T1, T2 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ) ) )
  }

  implicit def formatTuple3[T1: Format, T2: Format, T3: Format]: Format[( T1, T2, T3 )] = new Format[( T1, T2, T3 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3 ) ) =>
        val ( r1, r2, r3 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3] )
        mergeErrors(
          Seq( r1, r2, r3 ),
          ( r1.get, r2.get, r3.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 3, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ) ) )
  }

  implicit def formatTuple4[T1: Format, T2: Format, T3: Format, T4: Format]: Format[( T1, T2, T3, T4 )] = new Format[( T1, T2, T3, T4 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4 ) ) =>
        val ( r1, r2, r3, r4 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4] )
        mergeErrors(
          Seq( r1, r2, r3, r4 ),
          ( r1.get, r2.get, r3.get, r4.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 4, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ) ) )
  }

  implicit def formatTuple5[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format]: Format[( T1, T2, T3, T4, T5 )] = new Format[( T1, T2, T3, T4, T5 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5 ) ) =>
        val ( r1, r2, r3, r4, r5 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 5, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ) ) )
  }

  implicit def formatTuple6[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format]: Format[( T1, T2, T3, T4, T5, T6 )] = new Format[( T1, T2, T3, T4, T5, T6 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6 ) ) =>
        val ( r1, r2, r3, r4, r5, r6 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 6, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ) ) )
  }

  implicit def formatTuple7[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format]: Format[( T1, T2, T3, T4, T5, T6, T7 )] = new Format[( T1, T2, T3, T4, T5, T6, T7 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 7, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ) ) )
  }

  implicit def formatTuple8[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 8, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ) ) )
  }

  implicit def formatTuple9[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 9, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ) ) )
  }

  implicit def formatTuple10[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 10, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ) ) )
  }

  implicit def formatTuple11[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 11, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ) ) )
  }

  implicit def formatTuple12[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 12, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ) ) )
  }

  implicit def formatTuple13[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 13, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ) ) )
  }

  implicit def formatTuple14[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 14, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ) ) )
  }

  implicit def formatTuple15[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 15, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ) ) )
  }

  implicit def formatTuple16[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 16, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ) ) )
  }

  implicit def formatTuple17[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format, T17: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16], t17.validate[T17] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get, r17.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 17, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ), Json.toJson( t._17 ) ) )
  }

  implicit def formatTuple18[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format, T17: Format, T18: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16], t17.validate[T17], t18.validate[T18] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get, r17.get, r18.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 18, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ), Json.toJson( t._17 ), Json.toJson( t._18 ) ) )
  }

  implicit def formatTuple19[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format, T17: Format, T18: Format, T19: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16], t17.validate[T17], t18.validate[T18], t19.validate[T19] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get, r17.get, r18.get, r19.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 19, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ), Json.toJson( t._17 ), Json.toJson( t._18 ), Json.toJson( t._19 ) ) )
  }

  implicit def formatTuple20[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format, T17: Format, T18: Format, T19: Format, T20: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16], t17.validate[T17], t18.validate[T18], t19.validate[T19], t20.validate[T20] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get, r17.get, r18.get, r19.get, r20.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 20, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ), Json.toJson( t._17 ), Json.toJson( t._18 ), Json.toJson( t._19 ), Json.toJson( t._20 ) ) )
  }

  implicit def formatTuple21[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format, T17: Format, T18: Format, T19: Format, T20: Format, T21: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16], t17.validate[T17], t18.validate[T18], t19.validate[T19], t20.validate[T20], t21.validate[T21] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get, r17.get, r18.get, r19.get, r20.get, r21.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 21, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ), Json.toJson( t._17 ), Json.toJson( t._18 ), Json.toJson( t._19 ), Json.toJson( t._20 ), Json.toJson( t._21 ) ) )
  }

  implicit def formatTuple22[T1: Format, T2: Format, T3: Format, T4: Format, T5: Format, T6: Format, T7: Format, T8: Format, T9: Format, T10: Format, T11: Format, T12: Format, T13: Format, T14: Format, T15: Format, T16: Format, T17: Format, T18: Format, T19: Format, T20: Format, T21: Format, T22: Format]: Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22 )] = new Format[( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22 )] {
    def reads( json: JsValue ) = json.validate[JsArray].flatMap {
      case JsArray( scala.collection.Seq( t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22 ) ) =>
        val ( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22 ) =
          ( t1.validate[T1], t2.validate[T2], t3.validate[T3], t4.validate[T4], t5.validate[T5], t6.validate[T6], t7.validate[T7], t8.validate[T8], t9.validate[T9], t10.validate[T10], t11.validate[T11], t12.validate[T12], t13.validate[T13], t14.validate[T14], t15.validate[T15], t16.validate[T16], t17.validate[T17], t18.validate[T18], t19.validate[T19], t20.validate[T20], t21.validate[T21], t22.validate[T22] )
        mergeErrors(
          Seq( r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22 ),
          ( r1.get, r2.get, r3.get, r4.get, r5.get, r6.get, r7.get, r8.get, r9.get, r10.get, r11.get, r12.get, r13.get, r14.get, r15.get, r16.get, r17.get, r18.get, r19.get, r20.get, r21.get, r22.get )
        )
      case _ => JsError( JsonValidationError( s"Expected array of size 22, found: " + json ) )
    }
    def writes( t: ( T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22 ) ) =
      JsArray( Seq( Json.toJson( t._1 ), Json.toJson( t._2 ), Json.toJson( t._3 ), Json.toJson( t._4 ), Json.toJson( t._5 ), Json.toJson( t._6 ), Json.toJson( t._7 ), Json.toJson( t._8 ), Json.toJson( t._9 ), Json.toJson( t._10 ), Json.toJson( t._11 ), Json.toJson( t._12 ), Json.toJson( t._13 ), Json.toJson( t._14 ), Json.toJson( t._15 ), Json.toJson( t._16 ), Json.toJson( t._17 ), Json.toJson( t._18 ), Json.toJson( t._19 ), Json.toJson( t._20 ), Json.toJson( t._21 ), Json.toJson( t._22 ) ) )
  }

}
