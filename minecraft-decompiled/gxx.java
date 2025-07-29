import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gxx {
   private static final Map<ame, RenderPipeline> aG = new HashMap<>();
   private static final RenderPipeline.Snippet aH = RenderPipeline.builder()
      .withUniform("DynamicTransforms", fnt.a)
      .withUniform("Projection", fnt.a)
      .buildSnippet();
   private static final RenderPipeline.Snippet aI = RenderPipeline.builder().withUniform("Fog", fnt.a).buildSnippet();
   private static final RenderPipeline.Snippet aJ = RenderPipeline.builder().withUniform("Globals", fnt.a).buildSnippet();
   private static final RenderPipeline.Snippet aK = RenderPipeline.builder(aH, aI).buildSnippet();
   private static final RenderPipeline.Snippet aL = RenderPipeline.builder(aH, aI).withUniform("Lighting", fnt.a).buildSnippet();
   private static final RenderPipeline.Snippet aM = RenderPipeline.builder(aK)
      .withVertexShader("core/terrain")
      .withFragmentShader("core/terrain")
      .withSampler("Sampler0")
      .withSampler("Sampler2")
      .withVertexFormat(fob.c, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aN = RenderPipeline.builder(aL)
      .withVertexShader("core/entity")
      .withFragmentShader("core/entity")
      .withSampler("Sampler0")
      .withSampler("Sampler2")
      .withVertexFormat(fob.d, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aO = RenderPipeline.builder(aL)
      .withVertexShader("core/entity")
      .withFragmentShader("core/entity")
      .withSampler("Sampler0")
      .withVertexFormat(fob.d, VertexFormat.b.h)
      .withShaderDefine("EMISSIVE")
      .buildSnippet();
   private static final RenderPipeline.Snippet aP = RenderPipeline.builder(aK)
      .withVertexShader("core/rendertype_beacon_beam")
      .withFragmentShader("core/rendertype_beacon_beam")
      .withSampler("Sampler0")
      .withVertexFormat(fob.c, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aQ = RenderPipeline.builder(aH)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(fob.l, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aR = RenderPipeline.builder(aH, aI, aJ)
      .withVertexShader("core/rendertype_end_portal")
      .withFragmentShader("core/rendertype_end_portal")
      .withSampler("Sampler0")
      .withSampler("Sampler1")
      .withVertexFormat(fob.f, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aS = RenderPipeline.builder(aK)
      .withVertexShader("core/rendertype_clouds")
      .withFragmentShader("core/rendertype_clouds")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(fob.b, VertexFormat.b.h)
      .withUniform("CloudInfo", fnt.a)
      .withUniform("CloudFaces", fnt.b, TextureFormat.RED8I)
      .buildSnippet();
   private static final RenderPipeline.Snippet aT = RenderPipeline.builder(aK, aJ)
      .withVertexShader("core/rendertype_lines")
      .withFragmentShader("core/rendertype_lines")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withVertexFormat(fob.h, VertexFormat.b.a)
      .buildSnippet();
   private static final RenderPipeline.Snippet aU = RenderPipeline.builder(aH)
      .withVertexShader("core/position_color")
      .withFragmentShader("core/position_color")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(fob.g, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aV = RenderPipeline.builder(aK)
      .withVertexShader("core/particle")
      .withFragmentShader("core/particle")
      .withSampler("Sampler0")
      .withSampler("Sampler2")
      .withVertexFormat(fob.e, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aW = RenderPipeline.builder(aV).withBlend(BlendFunction.TRANSLUCENT).withCull(false).buildSnippet();
   private static final RenderPipeline.Snippet aX = RenderPipeline.builder(aH)
      .withVertexShader("core/gui")
      .withFragmentShader("core/gui")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(fob.g, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aY = RenderPipeline.builder(aH)
      .withVertexShader("core/position_tex_color")
      .withFragmentShader("core/position_tex_color")
      .withSampler("Sampler0")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(fob.k, VertexFormat.b.h)
      .buildSnippet();
   private static final RenderPipeline.Snippet aZ = RenderPipeline.builder(aH)
      .withVertexShader("core/rendertype_outline")
      .withFragmentShader("core/rendertype_outline")
      .withSampler("Sampler0")
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .withVertexFormat(fob.k, VertexFormat.b.h)
      .buildSnippet();
   public static final RenderPipeline.Snippet a = RenderPipeline.builder()
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .withVertexFormat(fob.f, VertexFormat.b.h)
      .withUniform("Projection", fnt.a)
      .buildSnippet();
   public static final RenderPipeline b = a(RenderPipeline.builder(aM).withLocation("pipeline/solid").build());
   public static final RenderPipeline c = a(RenderPipeline.builder(aM).withLocation("pipeline/wireframe").withPolygonMode(PolygonMode.WIREFRAME).build());
   public static final RenderPipeline d = a(RenderPipeline.builder(aM).withLocation("pipeline/cutout_mipped").withShaderDefine("ALPHA_CUTOUT", 0.5F).build());
   public static final RenderPipeline e = a(RenderPipeline.builder(aM).withLocation("pipeline/cutout").withShaderDefine("ALPHA_CUTOUT", 0.1F).build());
   public static final RenderPipeline f = a(RenderPipeline.builder(aM).withLocation("pipeline/translucent").withBlend(BlendFunction.TRANSLUCENT).build());
   public static final RenderPipeline g = a(
      RenderPipeline.builder(aM).withLocation("pipeline/tripwire").withShaderDefine("ALPHA_CUTOUT", 0.1F).withBlend(BlendFunction.TRANSLUCENT).build()
   );
   public static final RenderPipeline h = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/translucent_moving_block")
         .withVertexShader("core/rendertype_translucent_moving_block")
         .withFragmentShader("core/rendertype_translucent_moving_block")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withVertexFormat(fob.c, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline i = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/armor_cutout_no_cull")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("NO_OVERLAY")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline j = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/armor_decal_cutout_no_cull")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("NO_OVERLAY")
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline k = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/armor_translucent")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("NO_OVERLAY")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .build()
   );
   public static final RenderPipeline l = a(RenderPipeline.builder(aN).withLocation("pipeline/entity_solid").withSampler("Sampler1").build());
   public static final RenderPipeline m = a(RenderPipeline.builder(aN).withLocation("pipeline/entity_solid_offset_forward").withSampler("Sampler1").build());
   public static final RenderPipeline n = a(
      RenderPipeline.builder(aN).withLocation("pipeline/entity_cutout").withShaderDefine("ALPHA_CUTOUT", 0.1F).withSampler("Sampler1").build()
   );
   public static final RenderPipeline o = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/entity_cutout_no_cull")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withSampler("Sampler1")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline p = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/entity_cutout_no_cull_z_offset")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withSampler("Sampler1")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline q = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/entity_translucent")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withSampler("Sampler1")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .build()
   );
   public static final RenderPipeline r = a(
      RenderPipeline.builder(aO)
         .withLocation("pipeline/entity_translucent_emissive")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withSampler("Sampler1")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline s = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/entity_smooth_cutout")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withSampler("Sampler1")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline t = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/entity_no_outline")
         .withShaderDefine("NO_OVERLAY")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline u = a(
      RenderPipeline.builder(aN)
         .withLocation("pipeline/breeze_wind")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("APPLY_TEXTURE_MATRIX")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("NO_CARDINAL_LIGHTING")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .build()
   );
   public static final RenderPipeline v = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/energy_swirl")
         .withVertexShader("core/entity")
         .withFragmentShader("core/entity")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("EMISSIVE")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("NO_CARDINAL_LIGHTING")
         .withShaderDefine("APPLY_TEXTURE_MATRIX")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.ADDITIVE)
         .withCull(false)
         .withVertexFormat(fob.d, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline w = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/eyes")
         .withVertexShader("core/entity")
         .withFragmentShader("core/entity")
         .withShaderDefine("EMISSIVE")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("NO_CARDINAL_LIGHTING")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(fob.d, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline x = a(
      RenderPipeline.builder(aL)
         .withLocation("pipeline/entity_decal")
         .withVertexShader("core/rendertype_entity_decal")
         .withFragmentShader("core/rendertype_entity_decal")
         .withSampler("Sampler0")
         .withSampler("Sampler1")
         .withSampler("Sampler2")
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .withCull(false)
         .withVertexFormat(fob.d, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline y = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/entity_shadow")
         .withVertexShader("core/rendertype_entity_shadow")
         .withFragmentShader("core/rendertype_entity_shadow")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(fob.d, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline z = a(
      RenderPipeline.builder(aL)
         .withLocation("pipeline/item_entity_translucent_cull")
         .withVertexShader("core/rendertype_item_entity_translucent_cull")
         .withFragmentShader("core/rendertype_item_entity_translucent_cull")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withVertexFormat(fob.d, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline A = a(RenderPipeline.builder(aP).withLocation("pipeline/beacon_beam_opaque").build());
   public static final RenderPipeline B = a(
      RenderPipeline.builder(aP).withLocation("pipeline/beacon_beam_translucent").withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).build()
   );
   public static final RenderPipeline C = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/dragon_explosion_alpha")
         .withVertexShader("core/rendertype_entity_alpha")
         .withFragmentShader("core/rendertype_entity_alpha")
         .withSampler("Sampler0")
         .withCull(false)
         .withVertexFormat(fob.d, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline D = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/leash")
         .withVertexShader("core/rendertype_leash")
         .withFragmentShader("core/rendertype_leash")
         .withSampler("Sampler2")
         .withCull(false)
         .withVertexFormat(fob.i, VertexFormat.b.f)
         .build()
   );
   public static final RenderPipeline E = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/water_mask")
         .withVertexShader("core/rendertype_water_mask")
         .withFragmentShader("core/rendertype_water_mask")
         .withColorWrite(false)
         .withVertexFormat(fob.f, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline F = a(
      RenderPipeline.builder(aH, aI, aJ)
         .withLocation("pipeline/glint")
         .withVertexShader("core/glint")
         .withFragmentShader("core/glint")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .withBlend(BlendFunction.GLINT)
         .withVertexFormat(fob.j, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline G = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/crumbling")
         .withVertexShader("core/rendertype_crumbling")
         .withFragmentShader("core/rendertype_crumbling")
         .withSampler("Sampler0")
         .withBlend(new BlendFunction(SourceFactor.DST_COLOR, DestFactor.SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO))
         .withDepthWrite(false)
         .withVertexFormat(fob.c, VertexFormat.b.h)
         .withDepthBias(-1.0F, -10.0F)
         .build()
   );
   public static final RenderPipeline H = a(
      RenderPipeline.builder(aQ, aI)
         .withLocation("pipeline/text")
         .withVertexShader("core/rendertype_text")
         .withFragmentShader("core/rendertype_text")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .build()
   );
   public static final RenderPipeline I = a(
      RenderPipeline.builder(aQ, aI)
         .withLocation("pipeline/text_background")
         .withVertexShader("core/rendertype_text_background")
         .withFragmentShader("core/rendertype_text_background")
         .withSampler("Sampler2")
         .withVertexFormat(fob.i, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline J = a(
      RenderPipeline.builder(aQ, aI)
         .withLocation("pipeline/text_intensity")
         .withVertexShader("core/rendertype_text_intensity")
         .withFragmentShader("core/rendertype_text_intensity")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withDepthBias(-1.0F, -10.0F)
         .build()
   );
   public static final RenderPipeline K = a(
      RenderPipeline.builder(aQ, aI)
         .withLocation("pipeline/text_polygon_offset")
         .withVertexShader("core/rendertype_text")
         .withFragmentShader("core/rendertype_text")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withDepthBias(-1.0F, -10.0F)
         .build()
   );
   public static final RenderPipeline L = a(
      RenderPipeline.builder(aQ)
         .withLocation("pipeline/text_see_through")
         .withVertexShader("core/rendertype_text_see_through")
         .withFragmentShader("core/rendertype_text_see_through")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline M = a(
      RenderPipeline.builder(aQ)
         .withLocation("pipeline/text_background_see_through")
         .withVertexShader("core/rendertype_text_background_see_through")
         .withFragmentShader("core/rendertype_text_background_see_through")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withVertexFormat(fob.i, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline N = a(
      RenderPipeline.builder(aQ)
         .withLocation("pipeline/text_intensity_see_through")
         .withVertexShader("core/rendertype_text_intensity_see_through")
         .withFragmentShader("core/rendertype_text_intensity_see_through")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline O = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/lightning")
         .withVertexShader("core/rendertype_lightning")
         .withFragmentShader("core/rendertype_lightning")
         .withBlend(BlendFunction.LIGHTNING)
         .withVertexFormat(fob.g, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline P = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/dragon_rays")
         .withVertexShader("core/rendertype_lightning")
         .withFragmentShader("core/rendertype_lightning")
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .withVertexFormat(fob.g, VertexFormat.b.e)
         .build()
   );
   public static final RenderPipeline Q = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/dragon_rays_depth")
         .withVertexShader("core/position")
         .withFragmentShader("core/position")
         .withColorWrite(false)
         .withVertexFormat(fob.f, VertexFormat.b.e)
         .build()
   );
   public static final RenderPipeline R = a(RenderPipeline.builder(aR).withLocation("pipeline/end_portal").withShaderDefine("PORTAL_LAYERS", 15).build());
   public static final RenderPipeline S = a(RenderPipeline.builder(aR).withLocation("pipeline/end_gateway").withShaderDefine("PORTAL_LAYERS", 16).build());
   public static final RenderPipeline T = a(RenderPipeline.builder(aS).withLocation("pipeline/flat_clouds").withCull(false).build());
   public static final RenderPipeline U = a(RenderPipeline.builder(aS).withLocation("pipeline/clouds").build());
   public static final RenderPipeline V = a(RenderPipeline.builder(aT).withLocation("pipeline/lines").build());
   public static final RenderPipeline W = a(RenderPipeline.builder(aT).withLocation("pipeline/secondary_block_outline").withDepthWrite(false).build());
   public static final RenderPipeline X = a(RenderPipeline.builder(aT).withLocation("pipeline/line_strip").withVertexFormat(fob.h, VertexFormat.b.b).build());
   public static final RenderPipeline Y = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/debug_line_strip")
         .withVertexShader("core/position_color")
         .withFragmentShader("core/position_color")
         .withCull(false)
         .withVertexFormat(fob.g, VertexFormat.b.d)
         .build()
   );
   public static final RenderPipeline Z = a(
      RenderPipeline.builder(aU).withLocation("pipeline/debug_filled_box").withVertexFormat(fob.g, VertexFormat.b.f).build()
   );
   public static final RenderPipeline aa = a(RenderPipeline.builder(aU).withLocation("pipeline/debug_quads").withCull(false).build());
   public static final RenderPipeline ab = a(
      RenderPipeline.builder(aU).withLocation("pipeline/debug_triangle_fan").withCull(false).withVertexFormat(fob.g, VertexFormat.b.g).build()
   );
   public static final RenderPipeline ac = a(
      RenderPipeline.builder(aU).withLocation("pipeline/debug_structure_quads").withCull(false).withDepthWrite(false).build()
   );
   public static final RenderPipeline ad = a(RenderPipeline.builder(aU).withLocation("pipeline/debug_section_quads").build());
   public static final RenderPipeline ae = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/world_border")
         .withVertexShader("core/rendertype_world_border")
         .withFragmentShader("core/rendertype_world_border")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.OVERLAY)
         .withCull(false)
         .withVertexFormat(fob.j, VertexFormat.b.h)
         .withDepthBias(-3.0F, -3.0F)
         .build()
   );
   public static final RenderPipeline af = a(RenderPipeline.builder(aV).withLocation("pipeline/opaque_particle").build());
   public static final RenderPipeline ag = a(
      RenderPipeline.builder(aV).withLocation("pipeline/translucent_particle").withBlend(BlendFunction.TRANSLUCENT).build()
   );
   public static final RenderPipeline ah = a(RenderPipeline.builder(aW).withLocation("pipeline/weather_depth_write").build());
   public static final RenderPipeline ai = a(RenderPipeline.builder(aW).withLocation("pipeline/weather_no_depth_write").withDepthWrite(false).build());
   public static final RenderPipeline aj = a(
      RenderPipeline.builder(aK)
         .withLocation("pipeline/sky")
         .withVertexShader("core/sky")
         .withFragmentShader("core/sky")
         .withDepthWrite(false)
         .withVertexFormat(fob.f, VertexFormat.b.g)
         .build()
   );
   public static final RenderPipeline ak = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/end_sky")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(fob.k, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline al = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/sunrise_sunset")
         .withVertexShader("core/position_color")
         .withFragmentShader("core/position_color")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(fob.g, VertexFormat.b.g)
         .build()
   );
   public static final RenderPipeline am = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/stars")
         .withVertexShader("core/stars")
         .withFragmentShader("core/stars")
         .withBlend(BlendFunction.OVERLAY)
         .withDepthWrite(false)
         .withVertexFormat(fob.f, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline an = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/celestial")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.OVERLAY)
         .withDepthWrite(false)
         .withVertexFormat(fob.k, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline ao = a(RenderPipeline.builder(aX).withLocation("pipeline/gui").build());
   public static final RenderPipeline ap = a(RenderPipeline.builder(aX).withLocation("pipeline/gui_invert").withBlend(BlendFunction.INVERT).build());
   public static final RenderPipeline aq = a(RenderPipeline.builder(aX).withLocation("pipeline/gui_text_highlight").withBlend(BlendFunction.ADDITIVE).build());
   public static final RenderPipeline ar = a(RenderPipeline.builder(aY).withLocation("pipeline/gui_textured").build());
   public static final RenderPipeline as = a(
      RenderPipeline.builder(aY).withLocation("pipeline/gui_textured_premultiplied_alpha").withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA).build()
   );
   public static final RenderPipeline at = a(
      RenderPipeline.builder(aY)
         .withLocation("pipeline/block_screen_effect")
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline au = a(
      RenderPipeline.builder(aY)
         .withLocation("pipeline/fire_screen_effect")
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline av = a(RenderPipeline.builder(aY).withLocation("pipeline/gui_opaque_textured_background").withoutBlend().build());
   public static final RenderPipeline aw = a(RenderPipeline.builder(aY).withLocation("pipeline/gui_nausea_overlay").withBlend(BlendFunction.ADDITIVE).build());
   public static final RenderPipeline ax = a(
      RenderPipeline.builder(aY).withLocation("pipeline/vignette").withBlend(new BlendFunction(SourceFactor.ZERO, DestFactor.ONE_MINUS_SRC_COLOR)).build()
   );
   public static final RenderPipeline ay = a(RenderPipeline.builder(aY).withLocation("pipeline/crosshair").withBlend(BlendFunction.INVERT).build());
   public static final RenderPipeline az = a(
      RenderPipeline.builder(aY).withLocation("pipeline/mojang_logo").withBlend(new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE)).build()
   );
   public static final RenderPipeline aA = a(
      RenderPipeline.builder()
         .withLocation("pipeline/entity_outline_blit")
         .withVertexShader("core/blit_screen")
         .withFragmentShader("core/blit_screen")
         .withSampler("InSampler")
         .withBlend(BlendFunction.ENTITY_OUTLINE_BLIT)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withColorWrite(true, false)
         .withVertexFormat(fob.f, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline aB = a(
      RenderPipeline.builder()
         .withLocation("pipeline/tracy_blit")
         .withVertexShader("core/blit_screen")
         .withFragmentShader("core/blit_screen")
         .withSampler("InSampler")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withVertexFormat(fob.f, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline aC = a(
      RenderPipeline.builder(aH)
         .withLocation("pipeline/panorama")
         .withVertexShader("core/panorama")
         .withFragmentShader("core/panorama")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withColorWrite(true, false)
         .withVertexFormat(fob.f, VertexFormat.b.h)
         .build()
   );
   public static final RenderPipeline aD = a(RenderPipeline.builder(aZ).withLocation("pipeline/outline_cull").build());
   public static final RenderPipeline aE = a(RenderPipeline.builder(aZ).withLocation("pipeline/outline_no_cull").withCull(false).build());
   public static final RenderPipeline aF = a(
      RenderPipeline.builder()
         .withLocation("pipeline/lightmap")
         .withVertexShader("core/blit_screen")
         .withFragmentShader("core/lightmap")
         .withUniform("LightmapInfo", fnt.a)
         .withVertexFormat(fob.f, VertexFormat.b.h)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );

   private static RenderPipeline a(RenderPipeline $$0) {
      aG.put($$0.getLocation(), $$0);
      return $$0;
   }

   public static List<RenderPipeline> a() {
      return aG.values().stream().toList();
   }
}
