package example.model;

import beans.BeanProperty
import javax.persistence._
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "dog")
case class Dog (
    @Field
    var breed: String,

    @Field
    var color: String
) {
  @Id
  @Field
  var id: String = _

  def this()
  {
    this("", "");
    id = "";
  }

  def this(a: String, b: String, c: String)
  {
    this(b, c);
    id = a;
  }

  override def toString() = f"""{"id":"$id%s", "breed":"$breed%s", "color":"$color%s"}"""
}
