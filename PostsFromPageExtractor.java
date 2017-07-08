import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

 class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("", "");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBAJIpARxAT9OIIR9NNmZBBCzZBzNm4G8aiOgBph1p8WpyNAik203IG16gK22FInDBgHMUDeVJijOxCTAURGVsat1VwOjrfnv0ZCrVECOngtXsicMzKZCXiiDM7iLqMOvuG9VnLp2w0dm2r95kK7JXO8epXHjtaJiZAgk4rcchjZC1ZAM4iRhb90ZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
   facebook.postStatusMessage("Hello World from Facebook4J.");

   //facebook.likePost("1378558255556606");
            //facebook.commentPhoto("447474898935911", "It's a nice photo!");
        }           
    }