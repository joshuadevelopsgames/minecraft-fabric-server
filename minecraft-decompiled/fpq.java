import com.google.gson.annotations.SerializedName;
import java.util.List;

public record fpq(List<fqh> a) implements fqg {
   public static fpq a() {
      return new fpq(List.of());
   }

   @SerializedName("regionDataList")
   public List<fqh> b() {
      return this.a;
   }
}
