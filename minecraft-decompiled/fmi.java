import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;

public record fmi(RenderPipeline a, fmg b) implements CompiledRenderPipeline {
   @Override
   public boolean isValid() {
      return this.b != fmg.b;
   }
}
