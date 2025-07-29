import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import javax.annotation.Nullable;

public class fpp extends fqq implements fqg {
   @SerializedName("name")
   @Nullable
   private String a;
   @SerializedName("uuid")
   @JsonAdapter(UUIDTypeAdapter.class)
   private UUID b;
   @SerializedName("operator")
   private boolean c;
   @SerializedName("accepted")
   private boolean d;
   @SerializedName("online")
   private boolean e;

   public String a() {
      return this.a == null ? "" : this.a;
   }

   public void a(String $$0) {
      this.a = $$0;
   }

   public UUID b() {
      return this.b;
   }

   public void a(UUID $$0) {
      this.b = $$0;
   }

   public boolean c() {
      return this.c;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   public boolean d() {
      return this.d;
   }

   public void b(boolean $$0) {
      this.d = $$0;
   }

   public boolean e() {
      return this.e;
   }

   public void c(boolean $$0) {
      this.e = $$0;
   }
}
