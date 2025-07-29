import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class fqb implements fqg {
   @SerializedName("slotId")
   public int a;
   @SerializedName("options")
   @JsonAdapter(fqb.a.class)
   public fqe b;
   @SerializedName("settings")
   public List<fqa> c;

   public fqb(int $$0, fqe $$1, List<fqa> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static fqb a(int $$0) {
      return new fqb($$0, fqe.b(), List.of(fqa.a(false)));
   }

   public fqb a() {
      return new fqb(this.a, this.b.c(), new ArrayList<>(this.c));
   }

   public boolean b() {
      return fqa.a(this.c);
   }

   static class a extends TypeAdapter<fqe> {
      private a() {
      }

      public void a(JsonWriter $$0, fqe $$1) throws IOException {
         $$0.jsonValue(new fpk().a($$1));
      }

      public fqe a(JsonReader $$0) throws IOException {
         String $$1 = $$0.nextString();
         return fqe.a(new fpk(), $$1);
      }
   }
}
