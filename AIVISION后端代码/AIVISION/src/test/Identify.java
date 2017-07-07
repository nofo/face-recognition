package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.TemplateDao;

public class Identify {
	
	public native float similarity(float[] feat1,float[] feat2);

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext resource  = new  ClassPathXmlApplicationContext("applicationContext.xml");
		TemplateDao ms=(TemplateDao) resource.getBean("tempdao");
		// TODO Auto-generated method stub
		float[] fea1={0f,1.56631f,0f,0f,0f,0.337054f,0f,2.03224f,0.0145687f,3.15584f,0.272723f,0f,0f,0.0653725f,0f,0f,0f,0.649093f,0f,0f,0f,0f,0f,0f,0f,0f,0.774146f,0f,0.380356f,0f,0f,0f,0f,0f,0.3076f,3.11916f,0.0557441f,0f,1.27759f,0f,0f,0.945593f,0.593927f,0f,4.54351f,0.829158f,0f,0f,0.0538719f,0f,0f,0f,0f,0f,0f,0f,0f,0.401907f,0f,0f,0.126646f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.0191373f,0f,1.56952f,0.0637826f,0f,0f,0.536985f,0f,0.273415f,0.162094f,0f,0.106719f,0f,1.30091f,0.496361f,0f,0f,0f,0f,0f,0f,0f,0.0587101f,0f,0.215194f,0.379388f,0f,0f,0.319753f,0f,0f,0f,0f,0f,0f,0f,0.135211f,0.100042f,0f,0f,0.0854776f,0.175738f,0f,0.6797f,0f,2.84845f,0.671231f,0f,2.66331f,0f,0f,1.91082f,0f,0.412064f,0.0421099f,2.06204f,0f,0f,0.100712f,0.260408f,0f,0f,2.40293f,0f,0f,0f,0f,0f,0f,0.956761f,0f,0f,0.34944f,0f,0.398623f,0f,0.26933f,0f,0f,0.784256f,0f,0f,0f,0f,0f,0f,0.11912f,0.0992015f,0f,0.43697f,0f,1.07253f,0f,0f,0f,0f,0f,0f,1.40311f,2.30254f,0f,0f,0f,0.245461f,0.0995985f,0f,0.818995f,0f,0f,1.41732f,0f,0f,0f,0f,0f,1.77797f,2.23133f,0f,0f,0f,3.10796f,0f,0f,0.0911738f,0f,1.9773f,0.4165f,0.887474f,0f,0f,0f,0.105584f,0.054919f,0f,0f,0f,0f,0.410369f,0.305694f,1.77341f,0f,0.142544f,0.663325f,0f,0f,0f,0f,0.0972905f,0f,0.281005f,0f,1.95503f,1.50086f,0f,0f,0.339073f,0f,0f,0.53024f,0f,0.154045f,0.530856f,0f,0f,2.36602f,0f,0f,0f,0.129189f,0.476241f,0f,0f,0f,1.33268f,0.115778f,0.802963f,0f,0f,0f,0.146747f,0f,0.0254585f,0.00612107f,0.363989f,0.681716f,1.47345f,0f,0f,0.149363f,0f,0f,0f,0f,0.221309f,0f,0f,0f,0f,3.24684f,0f,0f,0f,4.22086f,0f,0f,1.45013f,0f,1.87428f,0f,0f,1.9038f,0f,0.111218f,0f,0.294618f,0.514836f,0.277666f,0f,0f,4.44793f,0f,0.567709f,0f,3.85404f,0f,0f,0f,0f,0f,0f,0f,0.893746f,1.15442f,0.454342f,0.121329f,0f,0f,0.035072f,1.14072f,0f,0f,0f,0.132192f,0.609757f,0f,0.475546f,0f,0f,0f,0f,1.15196f,0.00748547f,0f,0f,0.56635f,0.0562231f,0.174262f,0.437553f,0.0835373f,0f,0f,2.07466f,0f,0f,0.974134f,0.264307f,0f,2.24017f,2.08107f,0f,0f,0f,0f,0f,0f,0f,0.881854f,0.163427f,0f,0f,0.107239f,0f,0f,0f,0f,0f,0.991793f,0f,0f,2.69469f,0.123805f,0.207579f,0.35798f,1.75555f,0f,0.27117f,0f,0f,0f,0f,0f,0.434092f,0.0325019f,1.5082f,0f,0f,2.42836f,0f,0f,0f,0f,0f,0.218647f,0.572253f,0f,0f,0f,0f,0f,1.64444f,0f,0.338799f,0.947113f,0f,0f,0.687938f,0f,0.279828f,0.244115f,0f,0f,0f,0f,0.0134426f,0f,0f,0.618763f,0f,0f,0f,1.70205f,0f,0.525008f,0.937994f,0.248694f,0f,1.93676f,0.0976906f,0f,1.24827f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,1.38784f,0.212916f,1.62319f,0.529308f,0f,0f,0f,0f,2.67787f,0f,2.23195f,0f,0f,0f,0f,0.387703f,4.74299f,0f,0f,1.42288f,0.306213f,0f,0f,0f,0f,2.1927f,1.10908f,0.268935f,1.63263f,0f,1.62353f,0f,0f,0f,0f,0f,0.68455f,0f,0f,1.59994f,0.0638993f,0f,0f,0f,0.263829f,0f,0f,0f,5.31456f,0f,0f,1.9084f,0.162295f,0f,0f,0f,0.171281f,0f,0f,0.522486f,0f,0f,0.0224719f,0.0126808f,0.260254f,0.486689f,1.03748f,0f,0.68635f,0f,0.487053f,0.388733f,0f,2.80164f,2.23209f,0f,0f,0f,0f,0.279417f,0.316329f,0.253718f,0.133976f,0f,0f,0f,0f,0.889084f,0.0306638f,2.6375f,0f,0f,0f,0.0641084f,1.21413f,0.711455f,3.36571f,0f,0f,0f,0.244229f,0.0812388f,0.476595f,0f,1.2963f,0f,0f,0f,0f,0f,0.264258f,0.415219f,0f,0f,0f,0f,0f,0f,0f,1.08448f,0.0941705f,0.127964f,1.15836f,0f,0f,0.766249f,0f,0f,0f,0.104693f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.244395f,0.504896f,1.47848f,0f,0f,0.318822f,0.14354f,2.67269f,0f,0f,0f,1.35235f,0f,5.1131f,0f,0f,0.38044f,0f,0.00549327f,0f,0.0455895f,0f,0f,0f,1.67678f,1.06384f,0f,0f,2.70958f,0.02332f,0.857025f,0f,0.292213f,0.242985f,0f,0f,0f,0f,1.54385f,0f,0f,0f,0.130398f,0f,0f,0f,0.930128f,0f,0f,0f,1.8756f,0f,0f,0f,0f,0.266366f,0f,4.5616f,0f,4.59597f,0.314978f,0.154639f,1.55367f,0f,0.133214f,0f,0f,0f,0f,0f,0f,2.01776f,0.162f,0.26332f,0f,0f,0.320644f,0.0589797f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.57189f,0.354865f,0f,0f,0.201219f,0f,0.233637f,0f,0f,0f,0f,0.764948f,0f,0f,0.33939f,0f,0.358067f,0f,0.448377f,0f,0f,0.555805f,0f,0.263579f,0.606803f,0.025112f,0f,0.549789f,0.0237147f,0f,0f,0f,0.22807f,0f,0f,0f,0f,0.110859f,0f,0f,0f,0f,0f,0f,5.96942f,0.923702f,0f,0f,0.328669f,0f,0f,0f,0f,0f,1.41194f,0f,0f,0f,1.75028f,0f,0f,0f,2.61048f,0f,1.48799f,0.793639f,0f,0f,0.210556f,0f,0f,0.947149f,0f,1.99938f,0.516396f,0f,2.05353f,0f,0.219353f,0f,2.5726f,1.92595f,0f,0f,0f,0f,0f,0f,1.55149f,0f,0f,0f,0f,0f,1.26634f,0f,0f,1.33876f,0f,0.132607f,0f,0f,0f,0f,0.0472975f,0f,1.05567f,0f,0.228355f,0.73665f,0.127834f,0.332269f,0f,0f,0f,0f,0f,0f,0.967207f,0f,0f,0.790356f,5.37174f,0.532607f,0f,0f,0f,0f,0.45988f,0.580174f,0.172272f,0f,0f,0f,3.80081f,0f,0f,0f,0.998074f,0f,0.622812f,0.780052f,0f,0f,0f,1.64625f,0f,0f,0f,1.33441f,0.123864f,1.27071f,0f,0.0426804f,0f,0f,0f,0.915092f,0f,0f,0f,0.0302132f,0f,0f,1.72754f,2.72791f,0f,1.22103f,0.0767264f,0f,0f,0f,0f,0f,0.601237f,0f,0f,0f,0f,0f,0f,0.575441f,0f,0f,0.25706f,0.61383f,0f,0f,0f,0f,0f,0.0958067f,0.379787f,0f,0.254883f,0.201945f,0f,0f,0f,0.135211f,0f,0f,0f,0f,0f,0f,0f,0f,1.50078f,0f,0f,0f,0f,0.168836f,0f,1.48733f,0f,0.288599f,0f,0f,0f,0f,0f,0f,2.29401f,0f,0f,0f,0.528459f,0f,1.40594f,0f,0.428962f,0f,0f,0f,2.93711f,0f,0f,0f,0f,0f,0f,0f,0.622875f,0.270699f,0.838215f,0f,0f,0.286195f,0f,0f,0.0123596f,0.985123f,0f,0f,0.163889f,0f,3.0319f,0f,0f,0f,0f,0.0845634f,0f,0f,0.260071f,0f,1.13834f,3.21346f,0f,0f,0f,0f,0.246511f,0f,0f,1.63106f,0.52229f,1.92127f,0f,0f,2.68286f,0f,0.275351f,0.0195863f,0.301915f,0.180046f,0f,0.013833f,0f,0f,0f,0f,0f,0f,1.23376f,0f,0.900114f,0f,0f,0f,0f,0f,0.14876f,0f,1.92873f,0f,0.0206248f,0.411254f,0f,0.735063f,0f,1.59349f,0.278903f,0.0119246f,0f,6.6604f,0.040898f,0f,0.656507f,0.337357f,0.494565f,0.677308f,0f,0.556259f,1.56874f,0f,0f,0f,0f,0f,0f,0.0410267f,0f,0.708115f,0f,0.133286f,0f,0f,0.565891f,0.835966f,0f,0f,0f,1.04759f,0.482547f,0f,0.176685f,0f,1.01628f,1.30422f,0.0209901f,0f,0f,1.49916f,0f,0f,0.282416f,5.53185f,0f,0f,0f,0.0681742f,0.296043f,0.466982f,0f,0f,0f,0.357741f,0f,0f,0.963023f,1.37672f,0.448863f,0f,0.071006f,0f,0f,0f,0f,2.8232f,0.0353256f,1.50966f,0f,0.499863f,0f,2.30896f,0.168374f,0f,0f,0f,0.945851f,0f,0.706754f,0f,0f,0f,0.705447f,0.178373f,1.41185f,0f,3.3692f,0f,0.0274844f,0.887462f,0.0496291f,0f,0f,0.767082f,0f,0.0645098f,0.652751f,0f,0f,0.171664f,2.50252f,3.16736f,0f,0f,1.32543f,0.109602f,1.9138f,0f,0.436226f,0.529274f,0.0345685f,0f,0f,1.90954f,0f,0f,0f,0f,0f,0f,1.22367f,0f,0.0875336f,0f,0f,0.262448f,0.674284f,0f,2.42971f,0.429976f,0f,0.657707f,2.52409f,0f,1.03035f,1.13183f,0.478769f,0f,0f,0f,0f,0.0294823f,0f,0f,0.0671219f,0f,0f,0f,0f,0f,0f,0f,0.217081f,0f,0f,0.61086f,0.146298f,0f,0f,0.295069f,1.07197f,0f,0f,0.133709f,0f,0f,2.88057f,0.118816f,0.437359f,0f,0f,0f,0.428811f,0f,6.09654f,2.02075f,0f,0f,0.157968f,0f,0f,0f,0f,0f,0f,0f,0f,1.14628f,0f,0f,0f,0.149542f,0f,0f,0.182719f,0f,1.64801f,0f,0.00194652f,0f,0f,3.4843f,0.34377f,0f,2.8642f,0f,0f,0.727222f,0f,0.31078f,0f,0f,0.03982f,0f,0f,0f,0f,0f,0f,0.208506f,0.390143f,0f,1.75745f,1.92595f,0f,1.38289f,0f,0f,0f,0f,1.69915f,0.0206918f,0f,0f,0f,0f,0f,0f,0f,2.32243f,0f,0f,0.418463f,0.126902f,0f,0.241796f,0f,0f,0.435286f,1.26634f,0f,0f,0f,0f,0f,1.01176f,0.0786185f,0f,0f,0.0944395f,0f,0f,0f,0.45649f,1.09102f,0.0832086f,0.521804f,0f,0f,0f,0f,0f,0.18721f,1.45731f,0f,0f,0f,0.158934f,0f,0f,0.538472f,0f,0.108712f,0.152452f,0f,0.593484f,0f,0.119775f,0f,0f,1.16626f,0f,0f,0f,0f,0f,1.05981f,0f,0.10944f,2.9102f,0f,0f,0f,0f,0.0927273f,0.520376f,0f,2.16927f,0f,0.209536f,0.403214f,0f,0.543538f,0f,0.714559f,0f,0f,0f,0f,0f,0.570462f,0.0538639f,0f,0.120017f,0f,0f,0f,0f,0.458664f,2.22861f,0f,0f,0f,1.65272f,0f,2.07252f,0.00350156f,0.0635422f,0f,0f,0.441946f,0f,0f,0f,0.300501f,0f,0f,0f,0f,0.994964f,0f,0f,0f,0.227863f,3.41469f,0.293418f,0f,0.711416f,0f,0.132219f,0f,0f,0.249443f,0f,0.370523f,0.209648f,1.7978f,0f,0f,1.47592f,0.415724f,0.691543f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,2.08667f,0f,0.337756f,0f,0f,0f,0.242489f,0.500862f,0f,0f,0.587103f,0f,0f,0.226208f,0f,0f,0f,3.74019f,0f,0f,0f,0f,0f,0f,0f,1.14066f,6.26074f,0f,0f,1.07037f,0f,0f,0.189043f,0f,0f,3.41129f,0.397438f,0.773608f,0f,0.0770059f,0.97085f,0f,0f,0.0542945f,0f,1.23477f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.143983f,0f,0.735651f,0.709763f,0.739397f,0f,0f,0f,0f,0f,0f,0f,0.0114763f,0.733093f,0.582484f,0f,0f,0f,0f,0f,0.937264f,1.33309f,0f,0f,0.860369f,0f,0.305384f,0f,0f,0f,0f,0f,0f,2.33911f,0f,1.92796f,0.424857f,0f,0f,0f,0.330027f,0.221555f,0f,0f,1.22877f,0.67711f,0f,0f,0.08712f,1.79924f,2.92233f,0.194348f,0.163444f,0f,0.368347f,0f,0f,3.70584f,0f,0f,1.18057f,0f,0.513957f,0.22128f,0f,0f,0.152126f,0f,0f,0f,0f,0.0359454f,0f,0f,0f,0f,0.112252f,0f,0f,0.114798f,0f,0f,2.59418f,0.0169175f,0f,0f,0f,0.431696f,0f,0f,0f,0f,0.569442f,0f,0.464833f,0f,0f,0f,0.0597067f,0f,0f,0.608672f,0f,0f,0f,0f,0.0120983f,0.174511f,0f,0f,1.92961f,0.112765f,0.164413f,0f,0f,0.0586184f,0f,0f,0.799747f,0f,0f,1.20358f,0f,0f,0f,1.32125f,1.23226f,0f,0f,0f,0f,0f,0f,0f,2.50929f,0f,0f,0.0861044f,0f,0f,0f,0f,0.508616f,0.0353284f,0f,0f,0f,0.0666999f,1.80821f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.383834f,0f,0f,0f,0f,0f,0f,0f,0f,0f,1.13272f,1.25282f,0f,0f,1.74818f,0f,0f,0f,0f,0f,1.01622f,0f,0.289299f,0f,0f,0f,0f,0f,0f,0.0204743f,0f,0f,0f,0f,0f,0.484679f,0f,0.344284f,0f,0f,0.899995f,0f,0f,0f,0f,0.654835f,0f,0.686108f,0f,0f,2.52341f,0.774046f,0f,0.373742f,0.830319f,3.62495f,0.0161846f,0.859055f,0f,0.00854157f,0f,0f,0.0161054f,0.204525f,0.298131f,0f,2.27992f,0.377083f,0f,0f,0f,0.208518f,0f,0f,0f,0.0168563f,0f,0f,0f,0.288786f,0f,0f,3.2111f,0f,1.33513f,0f,0.763248f,0f,0.512328f,2.17575f,0f,0.0468703f,0.705919f,0f,0f,0f,0.76969f,0.708373f,0.358967f,0f,0.28978f,0.0847803f,2.20752f,0.728438f,0f,0f,0f,0f,0.481067f,2.05824f,0f,0f,0f,0f,0f,0f,0.0697321f,0f,0f,1.00508f,0f,0f,2.42093f,0f,0f,0f,0.751277f,0f,0f,0f,0f,0f,0f,0f,0f,1.04292f,0f,0f,0f,5.20907f,0.997593f,0.544586f,0f,0f,0f,1.1827f,0.663659f,0f,0f,0f,0f,0f,0f,0f,0.611355f,1.57863f,0f,0.0230735f,0f,0f,2.29148f,0f,0.335405f,0f,0f,0f,0.071929f,3.14042f,0f,0.229827f,0f,0.425605f,0f,0f,0f,0f,0f,0f,0.242787f,0f,0f,0f,0.798171f,0f,0f,0f,2.0976f,0f,0f,0.856283f,1.42682f,0.451406f,0f,0.160848f,0f,0.502885f,0f,0f,0f,2.77352f,0.678116f,0f,0f,0.0223364f,1.12746f,0f,0f,0f,0.97486f,0f,0f,0f,0.420806f,0f,0f,0.266949f,0f,0.361135f,0f,0.995223f,0f,0f,0f,2.43651f,0f,0f,0f,0.0505656f,0f,0f,0f,0f,0f,0.149969f,0.613807f,0.631193f,0.471005f,0f,0f,0f,0.414574f,0.787656f,0.594976f,0f,0.213134f,1.12343f,0.0523239f,0f,0f,0f,0f,0f,0.713106f,0f,0.464748f,1.01209f,0.214261f,0f,1.17151f,0f,0.97903f,0.767812f,0f,0.707332f,0f,0f,0.0144893f,2.32059f,0f,0.464991f,0f,1.89342f,3.05728f,0f,0f,0f,2.6396f,0.151609f,0f,0f,0.703941f,0.176324f,0.140937f,0f,0f,0.960991f,0f,0f,0.477803f,0f,0f,0.0667684f,0.964068f,0f,0f,0f,0f,0f,0.855265f,0f,0.134328f,0f,6.35297f,2.16323f,0f,0f,0f,0.204297f,0f,0f,0.183442f,0f,0f,1.98237f,0f,0.492071f,0.330298f,0f,0f,0f,0f,0f,0f,0f,2.54594f,3.35431f,0.938854f,0f,2.5692f,0f,2.63587f,0f,1.11877f,0.272881f,0.562265f,0f,0f,0f,0f,2.17523f,2.02056f,0.69156f,0f,0f,0.30728f,0.438138f,0f,0f,1.28318f,0f,0.0262788f,0f,0.137636f,0f,4.19012f,0.050443f,2.39385f,0.698724f,0.0338885f,0f,0f,0f,3.00174f,0f,0f,0f,0.0809846f,4.012f,0f,0f,0f,3.26f,2.40438f,0f,0f,0f,0f,0f,0f,0f,0.164401f,0f,0f,0.561311f,0f,0f,0f,0f,4.21929f,0f,0f,0f,0f,0f,0f,2.65311f,0f,0f,0f,0.181755f,0f,0f,0f,0f,0f,1.23902f,0f,0.150232f,0f,0f,0f,0.0212197f,0.770442f,0.148702f,2.57312f,0f,0.482746f,0f,0f,0f,0.393122f,1.51534f,0f,1.66747f,0.163933f,0f,0f,0f,0f,0.297417f,0.311476f,0f,0f,0f,0f,0f,0f,0f,0.542742f,0f,0.865434f,1.23486f,0f,0f,0f,0f,0f,1.03425f,0.103402f,0.665727f,0f,0.872931f,0f,0.106294f,0f,0f,0f,1.76067f,0f,0.682822f,0.183781f,0f,0.931453f,0f,0f,0f,0f,0.760747f,0f,0f,0f,0.0472875f,0f,4.53864f,0f,0f};
	    float[] fea2={0f,0f,0f,0f,0f,0.626147f,0f,0f,0f,0f,0.809071f,0f,0f,0f,0f,0f,0f,1.88161f,0f,0f,0.0671606f,0f,0f,0f,0f,0f,0f,0f,1.17829f,0f,0f,1.33435f,0f,0f,0.989882f,0f,0.305693f,0f,0.102239f,0f,0f,0f,0f,0f,4.91817f,0.7485f,0.401675f,0f,0f,0.454697f,0.152636f,0.703475f,0f,0f,0f,0.269316f,1.30935f,1.27716f,0f,0.648866f,0f,0.793753f,1.5165f,0f,0.77764f,0f,0f,1.60926f,0f,0f,0f,0.357663f,0f,0f,0.0274441f,0.466061f,0f,0f,0f,0.914834f,2.01331f,0f,0f,0f,0f,0.365479f,0f,0f,0.996773f,0.0116437f,0f,0f,0f,0f,2.28067f,0.815464f,0f,0.157015f,0f,0f,0.207501f,0f,0.368985f,0.297333f,0.129676f,0f,1.7964f,0.916167f,0f,0f,0f,0.045391f,0f,0.541641f,1.36626f,0f,0.525726f,0.340151f,0.0314204f,1.41604f,0f,1.75189f,0.656811f,0f,0f,0f,0.0471212f,0f,0f,0f,0f,0f,0f,2.41445f,0f,0f,0f,0.195746f,0f,0f,0f,0f,0f,0f,0f,0.518101f,0f,0f,0f,1.63198f,0f,0.213625f,0f,0.521407f,0.587983f,0f,0f,0f,0f,0.239035f,0f,0.797943f,0f,0.211463f,0f,0f,0f,0f,0f,0f,1.30264f,0f,0f,0f,0f,2.555f,1.3958f,0.388608f,0f,1.57339f,1.0756f,0.419376f,0f,0f,0f,0.870955f,0.272279f,5.86207f,0f,0f,0.450726f,4.26305f,0f,0f,0f,0f,0f,0.855969f,4.43323f,0.336298f,1.36741f,0f,0.484422f,0f,0f,0f,0f,0.174255f,0f,0f,1.15266f,0.0668344f,0.661213f,0f,0f,0.524421f,0f,0f,0f,2.42182f,0.370664f,0f,0f,0.673574f,0f,0f,0.965775f,0f,0f,0f,0f,0.0608363f,2.91871f,0f,0f,0f,0.534897f,0f,0.442514f,0.437544f,0f,0.809647f,0f,2.29704f,0.252162f,0f,2.96696f,0f,0f,0f,0.917605f,0.518271f,0f,0f,0f,0f,1.04281f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.979823f,0.591991f,0.209984f,0.429834f,0.249595f,0.0258473f,1.2448f,0f,0f,0.339278f,0f,0.94557f,0f,0.461719f,1.6869f,0f,0.451206f,0f,1.23652f,0f,0f,0f,0f,0.744384f,0f,1.28362f,1.33169f,0f,0f,0f,0.0403054f,3.01339f,0f,0.663202f,0f,2.71586f,0f,0.85322f,0.155666f,0f,0f,0f,0.102749f,0f,0.435076f,0f,0f,0f,0.570321f,0.0775019f,0f,0f,0f,0f,0.313725f,0.656974f,1.24193f,0f,0f,0f,0f,0.304656f,0f,0f,0.125403f,0f,0f,0.415028f,0f,0f,0f,3.52124f,0.771779f,0f,0.537254f,1.69484f,0f,0f,0f,0f,1.14404f,0.461418f,1.08161f,0f,0.823233f,0.158696f,0f,0f,0f,0f,0f,0f,0f,0.150436f,0.0963426f,2.91352f,0f,1.22593f,0f,2.11633f,0f,0f,0f,0f,0f,0f,3.82936f,0.701182f,0.38125f,0f,1.47262f,0f,0f,0.0134602f,0f,0.174106f,0f,0f,0f,0.639572f,0f,0.0115291f,0.628656f,3.11424f,0f,0.0439803f,0.764267f,0f,0f,0.522642f,0f,0f,0.320553f,0f,0.369898f,1.91071f,0f,0f,0f,0f,0.633122f,0f,0f,0f,2.21061f,0f,0f,0.901444f,0f,0f,0f,0f,0f,1.61187f,0f,0.166403f,0.449521f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.0559379f,0f,2.02944f,1.10691f,0f,0f,1.18249f,0f,1.58511f,0f,0f,0f,0.529758f,0.391632f,0f,0f,0f,2.66943f,0f,0.866892f,0f,0f,0f,0.145535f,0f,0.929218f,2.22575f,0f,0f,0f,0.553304f,0f,0f,0f,0f,0.253806f,0f,0f,2.97726f,1.06095f,0f,0.59014f,0f,0f,0.893951f,0f,0.690403f,0f,4.14972f,0f,0f,0.571665f,0f,0f,0f,0f,0.570781f,0f,0.0918549f,0f,0.779913f,0f,0f,0f,0.431839f,1.97463f,0.0652156f,1.19436f,0f,0.394958f,0f,0f,0f,2.4759f,0f,0.335246f,0f,0f,0f,0.282677f,0.0740489f,0f,0.042902f,0f,0.796721f,0f,0.146076f,0.267218f,0f,3.70764f,0f,0f,0.670574f,0.100282f,1.50631f,0.830418f,3.35386f,0f,0.827181f,0f,0f,0f,0.286249f,0f,0f,0f,0f,0f,0f,0f,0.323476f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.381155f,4.7257f,0f,2.76793f,1.13204f,0f,0f,0f,0f,0.996773f,0f,0f,0f,0.516795f,2.81246f,0f,0f,0.723926f,2.39645f,0f,2.82991f,0f,0f,0f,0.140738f,1.81576f,0.145545f,0.142364f,0f,0.248633f,0.295916f,1.61031f,0f,0f,0.185298f,0f,0f,2.12775f,0f,0.492779f,0.824999f,3.08572f,0.0170152f,1.0325f,0f,0.255915f,3.83636f,0.29007f,1.06537f,0.390789f,1.83472f,0f,0f,0.426832f,0.0566078f,0f,2.51307f,0f,0f,0f,0f,0.0795197f,0.503168f,0f,1.23507f,0.035461f,0f,0.641826f,0f,0.155097f,0f,0.441027f,0f,0.391981f,0.348689f,3.06212f,0f,0.69911f,0.124368f,0f,3.13652f,0f,0f,0.449569f,1.14873f,0.89346f,0f,0.711644f,0f,0.606365f,0.906455f,0f,0f,0.908868f,0f,0.163528f,0.267669f,0.659626f,0f,0f,0.156728f,0f,0.84015f,0f,0f,0f,0f,0.207455f,0f,0f,0.0121429f,0.17088f,0f,0f,0f,0f,0f,0.0605314f,0.269405f,0f,0f,0.420942f,0f,0f,3.44702f,0f,0.00229284f,0f,0f,0f,0.101651f,0f,0f,0.272729f,0.232822f,0f,0f,0f,0f,0f,0f,0.0166048f,1.39733f,0f,0.107319f,0f,0f,0f,0f,0f,0.36817f,0f,1.65053f,0.588053f,0f,0f,0.226703f,0f,0.306717f,0f,0f,0f,0f,0.632342f,1.07587f,3.42087f,0f,0.908077f,0.692868f,0f,1.63615f,4.19588f,0f,0f,0f,0f,0f,0f,2.94148f,0.0245649f,0f,1.17568f,0f,0.172792f,0f,0.112866f,0f,0f,0f,0f,0.0492576f,0.0940796f,0f,1.22231f,0f,0f,0f,0f,0f,0f,0f,0.0645189f,0f,0.750073f,0f,0.118498f,0f,0f,1.02675f,0f,0f,0.544158f,0f,0.00817395f,1.86017f,0f,0f,0f,0.222318f,0f,0f,0.468382f,2.63751f,0f,0f,0f,0.649779f,0f,0f,0.316422f,0f,0f,0f,0f,0f,0.0452898f,0f,0f,0f,0.627889f,0f,0.628207f,0.349732f,1.23129f,0.382131f,0.236243f,0.0256381f,0f,0f,0f,0.690073f,1.33095f,0f,0f,0f,0f,0f,1.01047f,1.17824f,0.704905f,0f,0f,0f,0f,0f,1.56912f,0f,0f,0f,0.865295f,0.119391f,0f,0.424043f,0f,0f,0.334946f,0.971406f,0f,0f,0f,0.170559f,0f,0.21568f,1.89144f,0f,0f,2.37347f,0f,0.45388f,0f,0f,0f,0f,0f,0f,0.0735924f,0f,0f,0f,0f,0f,0f,0.158186f,0f,0.715484f,0f,0f,0f,0.0410706f,0.0152847f,0f,0f,0f,0.831995f,0f,0f,0.663258f,0f,0f,0f,0.382264f,0.00565494f,0f,0f,0f,0f,0.12878f,0f,0.128729f,0f,0.128275f,0f,0f,0.718627f,0f,3.03349f,0.215413f,0.89908f,0.131966f,0f,0f,0f,0f,0f,0f,0f,0f,1.84417f,0f,0.454348f,1.13377f,0f,0.41342f,0f,3.00647f,0f,0.209928f,1.11149f,0.456189f,0f,2.31963f,0f,0f,0f,0f,0f,0f,1.53187f,0f,0f,0f,0f,0f,0.581534f,1.13849f,0f,0f,1.61429f,0.330407f,1.84728f,1.42323f,0f,0.357367f,0f,1.3004f,1.93127f,0f,0.911847f,0f,0f,0f,0f,0f,0f,0f,0f,0.235762f,1.49579f,0f,0f,0f,0.0293332f,0.07136f,0.839703f,1.38778f,0f,2.99005f,0f,0.639476f,0f,0.239915f,0.0851567f,0f,0f,0f,0f,2.2968f,0f,2.33655f,0f,0f,1.1437f,1.89244f,0f,0f,0f,1.87389f,0.392684f,1.473f,0f,0f,0f,0.055625f,0f,1.11922f,0.551844f,0f,0f,3.52997f,0.0896174f,0f,0f,0f,1.32015f,0f,0.696353f,0.725538f,0f,0.0850514f,0.962426f,0f,0f,1.09011f,0f,0f,0f,2.86965f,0.296809f,0f,0.0645652f,0.335873f,0f,0f,0f,3.95625f,0f,0f,0.30818f,1.99631f,0f,0f,2.21686f,0f,1.32733f,0f,0f,0f,0f,0.815489f,0f,0f,0f,1.56261f,0f,0f,0f,1.41648f,0f,1.55263f,1.3128f,0f,0.0682456f,0.486279f,1.44373f,0f,0f,0.657085f,0.38844f,0f,0f,3.46223f,1.51301f,1.29208f,0.394696f,0f,0f,0f,1.81962f,0.00734879f,1.29779f,0.765731f,1.21748f,0.389003f,0.379762f,1.05643f,2.27041f,0.0203785f,1.36884f,0.416232f,0f,0f,2.39556f,1.72192f,0f,0.0059592f,0f,0.20167f,0.0558322f,0.209666f,2.99887f,1.19235f,0f,0.361687f,0f,0.391926f,0f,0f,0f,0f,0f,0.724523f,0f,0f,0.593993f,0f,0.0789985f,0f,0.126615f,0f,1.74784f,0f,0.00769832f,0f,2.6822f,1.05393f,0f,0f,0f,0f,0.230905f,0.564229f,0f,0.338561f,0.620453f,0f,0f,0f,0.328605f,0f,0.130073f,0f,0.104468f,0.530425f,0f,1.55337f,0.144253f,0.25927f,0.0618567f,0f,0f,0f,1.43738f,0f,0f,0f,0.400434f,0.263488f,1.8256f,1.17638f,0f,0f,0f,0f,0.941763f,0f,0f,0f,0f,0.283607f,0f,1.42286f,0f,0f,0f,0.659491f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.713027f,0.126461f,0f,1.88058f,2.77112f,0f,0.227576f,1.08358f,0.292662f,0.259827f,0f,0f,0.127776f,0f,0f,0f,0f,0f,0f,0f,0f,0f,3.8658f,2.54953f,0f,0f,0.407597f,0f,0f,0f,0f,0.0595936f,1.07773f,0.143837f,0f,0f,0f,0f,0f,2.29474f,0.555303f,3.25639f,0f,0f,0.163368f,0f,0f,0.0219749f,0f,0f,2.40844f,0.262056f,0f,0f,0.234541f,0f,0f,1.81302f,0f,0f,0f,0f,0.201378f,0f,0.629522f,0f,0f,0.387662f,0.468519f,0f,0f,0f,0f,0f,1.83634f,0f,0f,0f,0f,0.260593f,0.115822f,2.25157f,0f,0.0589535f,0.181599f,0f,0f,0f,0f,0f,2.58697f,0f,0f,0f,0f,0f,0f,3.33782f,0.0803856f,0f,0f,1.25235f,0f,0f,0f,0.0316647f,0.085476f,0.542498f,1.54537f,3.9387f,0f,0.743876f,0.63748f,0f,0.242763f,1.41978f,1.52989f,0f,0f,1.59031f,0.522654f,0.722297f,2.06444f,0f,0f,0f,0f,0f,0f,1.45069f,0f,0.739327f,0f,0f,0.386154f,1.23593f,0.144204f,3.05642f,0f,0f,0.356496f,0f,1.44188f,0f,0f,0f,0.0598137f,0f,0f,0f,0f,0.0521572f,0f,0f,0f,1.30887f,0f,0f,0.207161f,0f,0f,0.00351113f,0f,0f,0f,0.762854f,0f,1.20558f,0.519957f,0f,0f,0f,0f,0.958232f,0f,0f,0f,0f,1.14782f,0f,0f,0.591993f,0.637884f,0f,0f,0f,0.17405f,0f,0f,0f,0f,0.113123f,1.36655f,0.0123608f,0f,1.84828f,0f,0.195864f,2.7136f,0f,0.157341f,0f,0.816285f,0.407623f,0.00872993f,0f,0f,1.57803f,0f,0f,2.54137f,0f,0f,0f,0.311099f,0.676208f,0f,2.66794f,0.948899f,0f,2.44737f,0.133255f,1.23844f,0f,0f,1.63874f,2.36483f,0f,2.47307f,0.0174342f,0.433011f,0.503755f,0f,0.56794f,0f,0f,1.45508f,0.33898f,0f,0f,0.12625f,0f,0f,0.811663f,0f,0.872656f,0f,0.813165f,0f,0f,0f,0f,1.92543f,0.0503099f,0f,1.82181f,0f,0.716221f,1.49231f,0.562583f,0f,0f,2.33706f,0f,0.644511f,2.00481f,0f,0f,0f,0.19205f,0f,0f,0f,0.398893f,3.70562f,0f,0f,3.0631f,0f,0f,0f,0f,0f,0.949667f,0f,0.115811f,0f,0f,0f,0f,0f,0f,0f,0.441492f,0.36182f,0f,0f,0f,0.320531f,0f,0f,0f,0.383642f,0f,0.195976f,0.145127f,0f,0.046432f,2.07468f,0f,0f,0f,0f,0f,0.549709f,0.267926f,0f,0.76393f,0f,0.433717f,0f,1.84649f,3.73567f,0.222323f,0f,0.131758f,0.625998f,0f,0.638674f,1.52804f,2.13803f,0f,0f,0.452036f,0f,0.945505f,0.546148f,0f,0f,0f,1.13337f,0f,2.43912f,0f,0f,0f,0f,0f,0f,0f,0f,0f,2.7026f,1.21193f,0f,0f,0f,0f,0f,0f,0.163597f,0f,1.47855f,1.3141f,0f,0f,0f,0f,0f,0f,0f,1.1866f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.616135f,0f,0f,0f,0.588757f,0f,0f,0f,0.0312146f,1.50411f,0f,0.22658f,0.0191468f,0.166462f,0f,0f,0f,0f,0f,0f,0f,0f,0.1559f,0f,0f,0.986157f,0f,0f,0f,0f,3.32371f,2.17103f,0f,1.23169f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.350785f,1.58692f,0f,0f,0f,0f,0.0466465f,1.03734f,0.779519f,0.276197f,0.563019f,0f,1.93598f,0f,0f,2.42123f,0f,0f,0.129274f,0f,0f,0.25289f,0.461451f,1.81356f,0f,0f,0f,0f,0f,1.56551f,0.0456414f,0f,0f,0.492145f,5.66544f,0f,0f,0f,0f,3.0594f,0f,0f,0f,1.03319f,0f,0f,0f,0f,0f,1.15767f,0f,2.97071f,0f,0f,3.60197f,0f,0.366382f,0.872927f,0f,0f,0f,0f,0f,1.27061f,0.536392f,0f,0f,0f,0f,0f,1.16168f,0f,0f,0.838817f,0.905954f,0f,0f,0.398257f,0f,1.62882f,1.52533f,0.121233f,1.98093f,0f,0f,0f,0.0512904f,0.200081f,0f,0f,0f,1.21739f,0f,0f,0f,0f,0.188679f,0f,2.567f,0.996989f,0f,0f,0f,0f,0f,0.0367743f,0f,2.54985f,0f,0f,0f,0f,0.24629f,0.332842f,0f,0f,0.366882f,0f,0f,0f,0.733599f,0.0735979f,0.0111567f,0f,0.536656f,0.608634f,0f,2.57162f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.418159f,0f,0f,1.23091f,0f,0f,3.45255f,0f,1.73208f,0f,0f,0.32585f,0.0284311f,0f,0f,0.544125f,0.0262797f,0.107339f,0f,0f,0f,0f,0f,0.830027f,1.66259f,0f,0f,1.13187f,0.798539f,0f,0f,0.478858f,0f,5.0485f,0.0956191f,0f,0.703401f,0.424792f,0f,0f,1.65934f,0f,3.56795f,0f,0f,0f,2.88488f,0f,0f,0f,0.917872f,0f,0f,1.02815f,0f,0f,0.271059f,0f,0.817055f,0f,0f,0f,0f,0f,0f,0f,0f,0f,0.268373f,0f,2.73968f,0f,0f,0f,0f,0f,0f,0f,0f,0.362417f,0f,0.192479f,0.539864f,0.59868f,0f,0f,0f,0f,0.652287f,0f,0f,0f,0f,0f,3.33848f,1.01347f,0f,0f,0.503992f,0f,0.719076f,2.17435f,0f,0f,1.14638f,0.138567f,2.32832f,0f,0f,0f,0f,0f,0f,0.249698f,1.70242f,0f,0.0461964f,1.04762f,0f,0.331593f,0f,0f,0.00220504f,0.117512f,0.185655f,1.01523f,1.1932f,0.475406f,0f,0f,0f,0f,2.16637f,0f,0f,0f,3.97266f,1.86998f,0f,0.0269238f,0.08328f,1.57931f,0f,0f,0f,0f,0.275224f,1.26348f,0f,0f,0.207992f,0.853074f,0f,0f,0f,0f,0f,0f,1.45454f,0.883271f,2.98249f,0.192372f,2.76357f,0f,1.40107f,0f,1.96211f,0f,0f,0.636306f,0f,0f,0f,0.591893f,0.843629f,0f,0f,0f,0f,0f,0f,0.40856f,0.292756f,0f,0.521963f,0f,1.4133f,0f,0f,0f,0.00491861f,2.22142f,0f,0f,0f,0.16772f,1.23411f,0f,0f,0f,0.107944f,3.69568f,0f,0f,0f,1.04198f,2.09501f,0f,0.133381f,0.363078f,0f,0f,1.39467f,0f,0f,0f,0f,1.65665f,0f,0.784232f,0f,0.0328798f,1.03343f,0.99836f,0f,0f,0f,0f,0.933234f,0.123457f,0.89971f,0f,0f,0f,2.04592f,0f,0f,0f,0f,0.867176f,0f,0.702139f,0.930593f,0f,0f,0f,0f,0f,4.01995f,0f,0f,0f,0.611733f,0.0581279f,0.805098f,0.674433f,0.174582f,2.40656f,0.657001f,0f,2.91787f,1.05186f,0f,0f,0f,0f,0f,0f,0.124279f,0f,0f,0f,0.951722f,0f,0.490286f,2.05842f,0f,0f,0.814296f,0f,1.84377f,3.35221f,0f,0f,0.47652f,0f,0f,0f,0f,0.271396f,0f,0f,0.247852f,0f,1.9496f,0f,1.1915f,0f,0f,0f,0.536392f,0f,0.231124f,0f,0f,0f,0f,3.47515f,0.562054f,0f};
		
		System.load("D:\\应用\\apache-tomcat-6.0.45\\webapps\\AIVISION\\WEB-INF\\classes\\similarity.dll");
		Identify te=new Identify();
		//System.out.println(te.similarity(fea1,fea2));
		System.out.println(ms.compare("0 0 0 0 0 0.626147 0 0 0 0 0.809071 0 0 0 0 0 0 1.88161 0 0 0.0671606 0 0 0 0 0 0 0 1.17829 0 0 1.33435 0 0 0.989882 0 0.305693 0 0.102239 0 0 0 0 0 4.91817 0.7485 0.401675 0 0 0.454697 0.152636 0.703475 0 0 0 0.269316 1.30935 1.27716 0 0.648866 0 0.793753 1.5165 0 0.77764 0 0 1.60926 0 0 0 0.357663 0 0 0.0274441 0.466061 0 0 0 0.914834 2.01331 0 0 0 0 0.365479 0 0 0.996773 0.0116437 0 0 0 0 2.28067 0.815464 0 0.157015 0 0 0.207501 0 0.368985 0.297333 0.129676 0 1.7964 0.916167 0 0 0 0.045391 0 0.541641 1.36626 0 0.525726 0.340151 0.0314204 1.41604 0 1.75189 0.656811 0 0 0 0.0471212 0 0 0 0 0 0 2.41445 0 0 0 0.195746 0 0 0 0 0 0 0 0.518101 0 0 0 1.63198 0 0.213625 0 0.521407 0.587983 0 0 0 0 0.239035 0 0.797943 0 0.211463 0 0 0 0 0 0 1.30264 0 0 0 0 2.555 1.3958 0.388608 0 1.57339 1.0756 0.419376 0 0 0 0.870955 0.272279 5.86207 0 0 0.450726 4.26305 0 0 0 0 0 0.855969 4.43323 0.336298 1.36741 0 0.484422 0 0 0 0 0.174255 0 0 1.15266 0.0668344 0.661213 0 0 0.524421 0 0 0 2.42182 0.370664 0 0 0.673574 0 0 0.965775 0 0 0 0 0.0608363 2.91871 0 0 0 0.534897 0 0.442514 0.437544 0 0.809647 0 2.29704 0.252162 0 2.96696 0 0 0 0.917605 0.518271 0 0 0 0 1.04281 0 0 0 0 0 0 0 0 0 0 0.979823 0.591991 0.209984 0.429834 0.249595 0.0258473 1.2448 0 0 0.339278 0 0.94557 0 0.461719 1.6869 0 0.451206 0 1.23652 0 0 0 0 0.744384 0 1.28362 1.33169 0 0 0 0.0403054 3.01339 0 0.663202 0 2.71586 0 0.85322 0.155666 0 0 0 0.102749 0 0.435076 0 0 0 0.570321 0.0775019 0 0 0 0 0.313725 0.656974 1.24193 0 0 0 0 0.304656 0 0 0.125403 0 0 0.415028 0 0 0 3.52124 0.771779 0 0.537254 1.69484 0 0 0 0 1.14404 0.461418 1.08161 0 0.823233 0.158696 0 0 0 0 0 0 0 0.150436 0.0963426 2.91352 0 1.22593 0 2.11633 0 0 0 0 0 0 3.82936 0.701182 0.38125 0 1.47262 0 0 0.0134602 0 0.174106 0 0 0 0.639572 0 0.0115291 0.628656 3.11424 0 0.0439803 0.764267 0 0 0.522642 0 0 0.320553 0 0.369898 1.91071 0 0 0 0 0.633122 0 0 0 2.21061 0 0 0.901444 0 0 0 0 0 1.61187 0 0.166403 0.449521 0 0 0 0 0 0 0 0 0 0.0559379 0 2.02944 1.10691 0 0 1.18249 0 1.58511 0 0 0 0.529758 0.391632 0 0 0 2.66943 0 0.866892 0 0 0 0.145535 0 0.929218 2.22575 0 0 0 0.553304 0 0 0 0 0.253806 0 0 2.97726 1.06095 0 0.59014 0 0 0.893951 0 0.690403 0 4.14972 0 0 0.571665 0 0 0 0 0.570781 0 0.0918549 0 0.779913 0 0 0 0.431839 1.97463 0.0652156 1.19436 0 0.394958 0 0 0 2.4759 0 0.335246 0 0 0 0.282677 0.0740489 0 0.042902 0 0.796721 0 0.146076 0.267218 0 3.70764 0 0 0.670574 0.100282 1.50631 0.830418 3.35386 0 0.827181 0 0 0 0.286249 0 0 0 0 0 0 0 0.323476 0 0 0 0 0 0 0 0 0 0 0.381155 4.7257 0 2.76793 1.13204 0 0 0 0 0.996773 0 0 0 0.516795 2.81246 0 0 0.723926 2.39645 0 2.82991 0 0 0 0.140738 1.81576 0.145545 0.142364 0 0.248633 0.295916 1.61031 0 0 0.185298 0 0 2.12775 0 0.492779 0.824999 3.08572 0.0170152 1.0325 0 0.255915 3.83636 0.29007 1.06537 0.390789 1.83472 0 0 0.426832 0.0566078 0 2.51307 0 0 0 0 0.0795197 0.503168 0 1.23507 0.035461 0 0.641826 0 0.155097 0 0.441027 0 0.391981 0.348689 3.06212 0 0.69911 0.124368 0 3.13652 0 0 0.449569 1.14873 0.89346 0 0.711644 0 0.606365 0.906455 0 0 0.908868 0 0.163528 0.267669 0.659626 0 0 0.156728 0 0.84015 0 0 0 0 0.207455 0 0 0.0121429 0.17088 0 0 0 0 0 0.0605314 0.269405 0 0 0.420942 0 0 3.44702 0 0.00229284 0 0 0 0.101651 0 0 0.272729 0.232822 0 0 0 0 0 0 0.0166048 1.39733 0 0.107319 0 0 0 0 0 0.36817 0 1.65053 0.588053 0 0 0.226703 0 0.306717 0 0 0 0 0.632342 1.07587 3.42087 0 0.908077 0.692868 0 1.63615 4.19588 0 0 0 0 0 0 2.94148 0.0245649 0 1.17568 0 0.172792 0 0.112866 0 0 0 0 0.0492576 0.0940796 0 1.22231 0 0 0 0 0 0 0 0.0645189 0 0.750073 0 0.118498 0 0 1.02675 0 0 0.544158 0 0.00817395 1.86017 0 0 0 0.222318 0 0 0.468382 2.63751 0 0 0 0.649779 0 0 0.316422 0 0 0 0 0 0.0452898 0 0 0 0.627889 0 0.628207 0.349732 1.23129 0.382131 0.236243 0.0256381 0 0 0 0.690073 1.33095 0 0 0 0 0 1.01047 1.17824 0.704905 0 0 0 0 0 1.56912 0 0 0 0.865295 0.119391 0 0.424043 0 0 0.334946 0.971406 0 0 0 0.170559 0 0.21568 1.89144 0 0 2.37347 0 0.45388 0 0 0 0 0 0 0.0735924 0 0 0 0 0 0 0.158186 0 0.715484 0 0 0 0.0410706 0.0152847 0 0 0 0.831995 0 0 0.663258 0 0 0 0.382264 0.00565494 0 0 0 0 0.12878 0 0.128729 0 0.128275 0 0 0.718627 0 3.03349 0.215413 0.89908 0.131966 0 0 0 0 0 0 0 0 1.84417 0 0.454348 1.13377 0 0.41342 0 3.00647 0 0.209928 1.11149 0.456189 0 2.31963 0 0 0 0 0 0 1.53187 0 0 0 0 0 0.581534 1.13849 0 0 1.61429 0.330407 1.84728 1.42323 0 0.357367 0 1.3004 1.93127 0 0.911847 0 0 0 0 0 0 0 0 0.235762 1.49579 0 0 0 0.0293332 0.07136 0.839703 1.38778 0 2.99005 0 0.639476 0 0.239915 0.0851567 0 0 0 0 2.2968 0 2.33655 0 0 1.1437 1.89244 0 0 0 1.87389 0.392684 1.473 0 0 0 0.055625 0 1.11922 0.551844 0 0 3.52997 0.0896174 0 0 0 1.32015 0 0.696353 0.725538 0 0.0850514 0.962426 0 0 1.09011 0 0 0 2.86965 0.296809 0 0.0645652 0.335873 0 0 0 3.95625 0 0 0.30818 1.99631 0 0 2.21686 0 1.32733 0 0 0 0 0.815489 0 0 0 1.56261 0 0 0 1.41648 0 1.55263 1.3128 0 0.0682456 0.486279 1.44373 0 0 0.657085 0.38844 0 0 3.46223 1.51301 1.29208 0.394696 0 0 0 1.81962 0.00734879 1.29779 0.765731 1.21748 0.389003 0.379762 1.05643 2.27041 0.0203785 1.36884 0.416232 0 0 2.39556 1.72192 0 0.0059592 0 0.20167 0.0558322 0.209666 2.99887 1.19235 0 0.361687 0 0.391926 0 0 0 0 0 0.724523 0 0 0.593993 0 0.0789985 0 0.126615 0 1.74784 0 0.00769832 0 2.6822 1.05393 0 0 0 0 0.230905 0.564229 0 0.338561 0.620453 0 0 0 0.328605 0 0.130073 0 0.104468 0.530425 0 1.55337 0.144253 0.25927 0.0618567 0 0 0 1.43738 0 0 0 0.400434 0.263488 1.8256 1.17638 0 0 0 0 0.941763 0 0 0 0 0.283607 0 1.42286 0 0 0 0.659491 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.713027 0.126461 0 1.88058 2.77112 0 0.227576 1.08358 0.292662 0.259827 0 0 0.127776 0 0 0 0 0 0 0 0 0 3.8658 2.54953 0 0 0.407597 0 0 0 0 0.0595936 1.07773 0.143837 0 0 0 0 0 2.29474 0.555303 3.25639 0 0 0.163368 0 0 0.0219749 0 0 2.40844 0.262056 0 0 0.234541 0 0 1.81302 0 0 0 0 0.201378 0 0.629522 0 0 0.387662 0.468519 0 0 0 0 0 1.83634 0 0 0 0 0.260593 0.115822 2.25157 0 0.0589535 0.181599 0 0 0 0 0 2.58697 0 0 0 0 0 0 3.33782 0.0803856 0 0 1.25235 0 0 0 0.0316647 0.085476 0.542498 1.54537 3.9387 0 0.743876 0.63748 0 0.242763 1.41978 1.52989 0 0 1.59031 0.522654 0.722297 2.06444 0 0 0 0 0 0 1.45069 0 0.739327 0 0 0.386154 1.23593 0.144204 3.05642 0 0 0.356496 0 1.44188 0 0 0 0.0598137 0 0 0 0 0.0521572 0 0 0 1.30887 0 0 0.207161 0 0 0.00351113 0 0 0 0.762854 0 1.20558 0.519957 0 0 0 0 0.958232 0 0 0 0 1.14782 0 0 0.591993 0.637884 0 0 0 0.17405 0 0 0 0 0.113123 1.36655 0.0123608 0 1.84828 0 0.195864 2.7136 0 0.157341 0 0.816285 0.407623 0.00872993 0 0 1.57803 0 0 2.54137 0 0 0 0.311099 0.676208 0 2.66794 0.948899 0 2.44737 0.133255 1.23844 0 0 1.63874 2.36483 0 2.47307 0.0174342 0.433011 0.503755 0 0.56794 0 0 1.45508 0.33898 0 0 0.12625 0 0 0.811663 0 0.872656 0 0.813165 0 0 0 0 1.92543 0.0503099 0 1.82181 0 0.716221 1.49231 0.562583 0 0 2.33706 0 0.644511 2.00481 0 0 0 0.19205 0 0 0 0.398893 3.70562 0 0 3.0631 0 0 0 0 0 0.949667 0 0.115811 0 0 0 0 0 0 0 0.441492 0.36182 0 0 0 0.320531 0 0 0 0.383642 0 0.195976 0.145127 0 0.046432 2.07468 0 0 0 0 0 0.549709 0.267926 0 0.76393 0 0.433717 0 1.84649 3.73567 0.222323 0 0.131758 0.625998 0 0.638674 1.52804 2.13803 0 0 0.452036 0 0.945505 0.546148 0 0 0 1.13337 0 2.43912 0 0 0 0 0 0 0 0 0 2.7026 1.21193 0 0 0 0 0 0 0.163597 0 1.47855 1.3141 0 0 0 0 0 0 0 1.1866 0 0 0 0 0 0 0 0 0 0 0 0.616135 0 0 0 0.588757 0 0 0 0.0312146 1.50411 0 0.22658 0.0191468 0.166462 0 0 0 0 0 0 0 0 0.1559 0 0 0.986157 0 0 0 0 3.32371 2.17103 0 1.23169 0 0 0 0 0 0 0 0 0 0 0.350785 1.58692 0 0 0 0 0.0466465 1.03734 0.779519 0.276197 0.563019 0 1.93598 0 0 2.42123 0 0 0.129274 0 0 0.25289 0.461451 1.81356 0 0 0 0 0 1.56551 0.0456414 0 0 0.492145 5.66544 0 0 0 0 3.0594 0 0 0 1.03319 0 0 0 0 0 1.15767 0 2.97071 0 0 3.60197 0 0.366382 0.872927 0 0 0 0 0 1.27061 0.536392 0 0 0 0 0 1.16168 0 0 0.838817 0.905954 0 0 0.398257 0 1.62882 1.52533 0.121233 1.98093 0 0 0 0.0512904 0.200081 0 0 0 1.21739 0 0 0 0 0.188679 0 2.567 0.996989 0 0 0 0 0 0.0367743 0 2.54985 0 0 0 0 0.24629 0.332842 0 0 0.366882 0 0 0 0.733599 0.0735979 0.0111567 0 0.536656 0.608634 0 2.57162 0 0 0 0 0 0 0 0 0 0 0.418159 0 0 1.23091 0 0 3.45255 0 1.73208 0 0 0.32585 0.0284311 0 0 0.544125 0.0262797 0.107339 0 0 0 0 0 0.830027 1.66259 0 0 1.13187 0.798539 0 0 0.478858 0 5.0485 0.0956191 0 0.703401 0.424792 0 0 1.65934 0 3.56795 0 0 0 2.88488 0 0 0 0.917872 0 0 1.02815 0 0 0.271059 0 0.817055 0 0 0 0 0 0 0 0 0 0.268373 0 2.73968 0 0 0 0 0 0 0 0 0.362417 0 0.192479 0.539864 0.59868 0 0 0 0 0.652287 0 0 0 0 0 3.33848 1.01347 0 0 0.503992 0 0.719076 2.17435 0 0 1.14638 0.138567 2.32832 0 0 0 0 0 0 0.249698 1.70242 0 0.0461964 1.04762 0 0.331593 0 0 0.00220504 0.117512 0.185655 1.01523 1.1932 0.475406 0 0 0 0 2.16637 0 0 0 3.97266 1.86998 0 0.0269238 0.08328 1.57931 0 0 0 0 0.275224 1.26348 0 0 0.207992 0.853074 0 0 0 0 0 0 1.45454 0.883271 2.98249 0.192372 2.76357 0 1.40107 0 1.96211 0 0 0.636306 0 0 0 0.591893 0.843629 0 0 0 0 0 0 0.40856 0.292756 0 0.521963 0 1.4133 0 0 0 0.00491861 2.22142 0 0 0 0.16772 1.23411 0 0 0 0.107944 3.69568 0 0 0 1.04198 2.09501 0 0.133381 0.363078 0 0 1.39467 0 0 0 0 1.65665 0 0.784232 0 0.0328798 1.03343 0.99836 0 0 0 0 0.933234 0.123457 0.89971 0 0 0 2.04592 0 0 0 0 0.867176 0 0.702139 0.930593 0 0 0 0 0 4.01995 0 0 0 0.611733 0.0581279 0.805098 0.674433 0.174582 2.40656 0.657001 0 2.91787 1.05186 0 0 0 0 0 0 0.124279 0 0 0 0.951722 0 0.490286 2.05842 0 0 0.814296 0 1.84377 3.35221 0 0 0.47652 0 0 0 0 0.271396 0 0 0.247852 0 1.9496 0 1.1915 0 0 0 0.536392 0 0.231124 0 0 0 0 3.47515 0.562054 0").getName());
		

	}

}
