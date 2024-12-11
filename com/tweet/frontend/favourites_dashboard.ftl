<#--
    @param Tweet `tweets`
-->
<#macro tweets>
    <div id="favourite_dashboard">
        <h1> Favourites Dashboard </h2>
            <#list tweets as tweet>
            <span class="tweet-style">
                <span> tweet.name</span>
                <span> tweet.handle</span>
                <span> tweet.tweetedTime</span>
                <span> tweet.tweetText</span>
            <br/>
        </#list>
    </div>
</#macro>