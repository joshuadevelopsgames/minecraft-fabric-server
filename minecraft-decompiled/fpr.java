import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Nullable;

public record fpr(
   @SerializedName("options") fqc a,
   @SerializedName("settings") List<fqa> b,
   @Nullable @SerializedName("regionSelectionPreference") fqk c,
   @Nullable @SerializedName("description") fps d
) implements fqg {
}
