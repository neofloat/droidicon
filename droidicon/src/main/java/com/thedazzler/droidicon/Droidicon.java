package com.thedazzler.droidicon;

import com.thedazzler.droidicon.util.TypefaceManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Devon Guinane on 11/15/14.
 * Droidicon
 */
public class Droidicon
{
    private static Map<String, Integer> iconMap = new HashMap<String, Integer>();

    static {
        //FontAwesome
        iconMap.put("fa-glass", 0xF000);
        iconMap.put("fa-music", 0xf001);
        iconMap.put("fa-search", 0xf002);
        iconMap.put("fa-envelope-o", 0xf003);
        iconMap.put("fa-heart", 0xf004);
        iconMap.put("fa-star", 0xf005);
        iconMap.put("fa-star-o", 0xf006);
        iconMap.put("fa-user", 0xf007);
        iconMap.put("fa-film", 0xf008);
        iconMap.put("fa-th-large", 0xf009);
        iconMap.put("fa-th", 0xf00a);
        iconMap.put("fa-th-list", 0xf00b);
        iconMap.put("fa-check", 0xf00c);
        iconMap.put("fa-times", 0xf00d);
        iconMap.put("fa-search-plus", 0xf00e);
        iconMap.put("fa-search-minus", 0xf010);
        iconMap.put("fa-power-off", 0xf011);
        iconMap.put("fa-signal", 0xf012);
        iconMap.put("fa-cog", 0xf013);
        iconMap.put("fa-trash-o", 0xf014);
        iconMap.put("fa-home", 0xf015);
        iconMap.put("fa-file-o", 0xf016);
        iconMap.put("fa-clock-o", 0xf017);
        iconMap.put("fa-road", 0xf018);
        iconMap.put("fa-download", 0xf019);
        iconMap.put("fa-arrow-circle-o-down", 0xf01a);
        iconMap.put("fa-arrow-circle-o-up", 0xf01b);
        iconMap.put("fa-inbox", 0xf01c);
        iconMap.put("fa-play-circle-o", 0xf01d);
        iconMap.put("fa-repeat", 0xf01e);
        iconMap.put("fa-refresh", 0xf021);
        iconMap.put("fa-list-alt", 0xf022);
        iconMap.put("fa-lock", 0xf023);
        iconMap.put("fa-flag", 0xf024);
        iconMap.put("fa-headphones", 0xf025);
        iconMap.put("fa-volume-off", 0xf026);
        iconMap.put("fa-volume-down", 0xf027);
        iconMap.put("fa-volume-up", 0xf028);
        iconMap.put("fa-qrcode", 0xf029);
        iconMap.put("fa-barcode", 0xf02a);
        iconMap.put("fa-tag", 0xf02b);
        iconMap.put("fa-tags", 0xf02c);
        iconMap.put("fa-book", 0xf02d);
        iconMap.put("fa-bookmark", 0xf02e);
        iconMap.put("fa-print", 0xf02f);
        iconMap.put("fa-camera", 0xf030);
        iconMap.put("fa-font", 0xf031);
        iconMap.put("fa-bold", 0xf032);
        iconMap.put("fa-italic", 0xf033);
        iconMap.put("fa-text-height", 0xf034);
        iconMap.put("fa-text-width", 0xf035);
        iconMap.put("fa-align-left", 0xf036);
        iconMap.put("fa-align-center", 0xf037);
        iconMap.put("fa-align-right", 0xf038);
        iconMap.put("fa-align-justify", 0xf039);
        iconMap.put("fa-list", 0xf03a);
        iconMap.put("fa-outdent", 0xf03b);
        iconMap.put("fa-indent", 0xf03c);
        iconMap.put("fa-video-camera", 0xf03d);
        iconMap.put("fa-picture-o", 0xf03e);
        iconMap.put("fa-pencil", 0xf040);
        iconMap.put("fa-map-marker", 0xf041);
        iconMap.put("fa-adjust", 0xf042);
        iconMap.put("fa-tint", 0xf043);
        iconMap.put("fa-pencil-square-o", 0xf044);
        iconMap.put("fa-share-square-o", 0xf045);
        iconMap.put("fa-check-square-o", 0xf046);
        iconMap.put("fa-move", 0xf047);
        iconMap.put("fa-step-backward", 0xf048);
        iconMap.put("fa-fast-backward", 0xf049);
        iconMap.put("fa-backward", 0xf04a);
        iconMap.put("fa-play", 0xf04b);
        iconMap.put("fa-pause", 0xf04c);
        iconMap.put("fa-stop", 0xf04d);
        iconMap.put("fa-forward", 0xf04e);
        iconMap.put("fa-fast-forward", 0xf050);
        iconMap.put("fa-step-forward", 0xf051);
        iconMap.put("fa-eject", 0xf052);
        iconMap.put("fa-chevron-left", 0xf053);
        iconMap.put("fa-chevron-right", 0xf054);
        iconMap.put("fa-plus-circle", 0xf055);
        iconMap.put("fa-minus-circle", 0xf056);
        iconMap.put("fa-times-circle", 0xf057);
        iconMap.put("fa-check-circle", 0xf058);
        iconMap.put("fa-question-circle", 0xf059);
        iconMap.put("fa-info-circle", 0xf05a);
        iconMap.put("fa-crosshairs", 0xf05b);
        iconMap.put("fa-times-circle-o", 0xf05c);
        iconMap.put("fa-check-circle-o", 0xf05d);
        iconMap.put("fa-ban", 0xf05e);
        iconMap.put("fa-arrow-left", 0xf060);
        iconMap.put("fa-arrow-right", 0xf061);
        iconMap.put("fa-arrow-up", 0xf062);
        iconMap.put("fa-arrow-down", 0xf063);
        iconMap.put("fa-share", 0xf064);
        iconMap.put("fa-resize-full", 0xf065);
        iconMap.put("fa-resize-small", 0xf066);
        iconMap.put("fa-plus", 0xf067);
        iconMap.put("fa-minus", 0xf068);
        iconMap.put("fa-asterisk", 0xf069);
        iconMap.put("fa-exclamation-circle", 0xf06a);
        iconMap.put("fa-gift", 0xf06b);
        iconMap.put("fa-leaf", 0xf06c);
        iconMap.put("fa-fire", 0xf06d);
        iconMap.put("fa-eye", 0xf06e);
        iconMap.put("fa-eye-slash", 0xf070);
        iconMap.put("fa-exclamation-triangle", 0xf071);
        iconMap.put("fa-plane", 0xf072);
        iconMap.put("fa-calendar", 0xf073);
        iconMap.put("fa-random", 0xf074);
        iconMap.put("fa-comment", 0xf075);
        iconMap.put("fa-magnet", 0xf076);
        iconMap.put("fa-chevron-up", 0xf077);
        iconMap.put("fa-chevron-down", 0xf078);
        iconMap.put("fa-retweet", 0xf079);
        iconMap.put("fa-shopping-cart", 0xf07a);
        iconMap.put("fa-folder", 0xf07b);
        iconMap.put("fa-folder-open", 0xf07c);
        iconMap.put("fa-resize-vertical", 0xf07d);
        iconMap.put("fa-resize-horizontal", 0xf07e);
        iconMap.put("fa-bar-chart-o", 0xf080);
        iconMap.put("fa-twitter-square", 0xf081);
        iconMap.put("fa-facebook-square", 0xf082);
        iconMap.put("fa-camera-retro", 0xf083);
        iconMap.put("fa-key", 0xf084);
        iconMap.put("fa-cogs", 0xf085);
        iconMap.put("fa-comments", 0xf086);
        iconMap.put("fa-thumbs-o-up", 0xf087);
        iconMap.put("fa-thumbs-o-down", 0xf088);
        iconMap.put("fa-star-half", 0xf089);
        iconMap.put("fa-heart-o", 0xf08a);
        iconMap.put("fa-sign-out", 0xf08b);
        iconMap.put("fa-linkedin-square", 0xf08c);
        iconMap.put("fa-thumb-tack", 0xf08d);
        iconMap.put("fa-external-link", 0xf08e);
        iconMap.put("fa-sign-in", 0xf090);
        iconMap.put("fa-trophy", 0xf091);
        iconMap.put("fa-github-square", 0xf092);
        iconMap.put("fa-upload", 0xf093);
        iconMap.put("fa-lemon-o", 0xf094);
        iconMap.put("fa-phone", 0xf095);
        iconMap.put("fa-square-o", 0xf096);
        iconMap.put("fa-bookmark-o", 0xf097);
        iconMap.put("fa-phone-square", 0xf098);
        iconMap.put("fa-twitter", 0xf099);
        iconMap.put("fa-facebook", 0xf09a);
        iconMap.put("fa-github", 0xf09b);
        iconMap.put("fa-unlock", 0xf09c);
        iconMap.put("fa-credit-card", 0xf09d);
        iconMap.put("fa-rss", 0xf09e);
        iconMap.put("fa-hdd", 0xf0a0);
        iconMap.put("fa-bullhorn", 0xf0a1);
        iconMap.put("fa-bell", 0xf0f3);
        iconMap.put("fa-certificate", 0xf0a3);
        iconMap.put("fa-hand-o-right", 0xf0a4);
        iconMap.put("fa-hand-o-left", 0xf0a5);
        iconMap.put("fa-hand-o-up", 0xf0a6);
        iconMap.put("fa-hand-o-down", 0xf0a7);
        iconMap.put("fa-arrow-circle-left", 0xf0a8);
        iconMap.put("fa-arrow-circle-right", 0xf0a9);
        iconMap.put("fa-arrow-circle-up", 0xf0aa);
        iconMap.put("fa-arrow-circle-down", 0xf0ab);
        iconMap.put("fa-globe", 0xf0ac);
        iconMap.put("fa-wrench", 0xf0ad);
        iconMap.put("fa-tasks", 0xf0ae);
        iconMap.put("fa-filter", 0xf0b0);
        iconMap.put("fa-briefcase", 0xf0b1);
        iconMap.put("fa-fullscreen", 0xf0b2);
        iconMap.put("fa-group", 0xf0c0);
        iconMap.put("fa-link", 0xf0c1);
        iconMap.put("fa-cloud", 0xf0c2);
        iconMap.put("fa-flask", 0xf0c3);
        iconMap.put("fa-scissors", 0xf0c4);
        iconMap.put("fa-files-o", 0xf0c5);
        iconMap.put("fa-paperclip", 0xf0c6);
        iconMap.put("fa-floppy-o", 0xf0c7);
        iconMap.put("fa-square", 0xf0c8);
        iconMap.put("fa-reorder", 0xf0c9);
        iconMap.put("fa-list-ul", 0xf0ca);
        iconMap.put("fa-list-ol", 0xf0cb);
        iconMap.put("fa-strikethrough", 0xf0cc);
        iconMap.put("fa-underline", 0xf0cd);
        iconMap.put("fa-table", 0xf0ce);
        iconMap.put("fa-magic", 0xf0d0);
        iconMap.put("fa-truck", 0xf0d1);
        iconMap.put("fa-pinterest", 0xf0d2);
        iconMap.put("fa-pinterest-square", 0xf0d3);
        iconMap.put("fa-google-plus-square", 0xf0d4);
        iconMap.put("fa-google-plus", 0xf0d5);
        iconMap.put("fa-money", 0xf0d6);
        iconMap.put("fa-caret-down", 0xf0d7);
        iconMap.put("fa-caret-up", 0xf0d8);
        iconMap.put("fa-caret-left", 0xf0d9);
        iconMap.put("fa-caret-right", 0xf0da);
        iconMap.put("fa-columns", 0xf0db);
        iconMap.put("fa-sort", 0xf0dc);
        iconMap.put("fa-sort-asc", 0xf0dd);
        iconMap.put("fa-sort-desc", 0xf0de);
        iconMap.put("fa-envelope", 0xf0e0);
        iconMap.put("fa-linkedin", 0xf0e1);
        iconMap.put("fa-undo", 0xf0e2);
        iconMap.put("fa-gavel", 0xf0e3);
        iconMap.put("fa-tachometer", 0xf0e4);
        iconMap.put("fa-comment-o", 0xf0e5);
        iconMap.put("fa-comments-o", 0xf0e6);
        iconMap.put("fa-bolt", 0xf0e7);
        iconMap.put("fa-sitemap", 0xf0e8);
        iconMap.put("fa-umbrella", 0xf0e9);
        iconMap.put("fa-clipboard", 0xf0ea);
        iconMap.put("fa-lightbulb-o", 0xf0eb);
        iconMap.put("fa-exchange", 0xf0ec);
        iconMap.put("fa-cloud-download", 0xf0ed);
        iconMap.put("fa-cloud-upload", 0xf0ee);
        iconMap.put("fa-user-md", 0xf0f0);
        iconMap.put("fa-stethoscope", 0xf0f1);
        iconMap.put("fa-suitcase", 0xf0f2);
        iconMap.put("fa-bell-o", 0xf0a2);
        iconMap.put("fa-coffee", 0xf0f4);
        iconMap.put("fa-cutlery", 0xf0f5);
        iconMap.put("fa-file-text-o", 0xf0f6);
        iconMap.put("fa-building", 0xf0f7);
        iconMap.put("fa-hospital", 0xf0f8);
        iconMap.put("fa-ambulance", 0xf0f9);
        iconMap.put("fa-medkit", 0xf0fa);
        iconMap.put("fa-fighter-jet", 0xf0fb);
        iconMap.put("fa-beer", 0xf0fc);
        iconMap.put("fa-h-square", 0xf0fd);
        iconMap.put("fa-plus-square", 0xf0fe);
        iconMap.put("fa-angle-double-left", 0xf100);
        iconMap.put("fa-angle-double-right", 0xf101);
        iconMap.put("fa-angle-double-up", 0xf102);
        iconMap.put("fa-angle-double-down", 0xf103);
        iconMap.put("fa-angle-left", 0xf104);
        iconMap.put("fa-angle-right", 0xf105);
        iconMap.put("fa-angle-up", 0xf106);
        iconMap.put("fa-angle-down", 0xf107);
        iconMap.put("fa-desktop", 0xf108);
        iconMap.put("fa-laptop", 0xf109);
        iconMap.put("fa-tablet", 0xf10a);
        iconMap.put("fa-mobile", 0xf10b);
        iconMap.put("fa-circle-o", 0xf10c);
        iconMap.put("fa-quote-left", 0xf10d);
        iconMap.put("fa-quote-right", 0xf10e);
        iconMap.put("fa-spinner", 0xf110);
        iconMap.put("fa-circle", 0xf111);
        iconMap.put("fa-reply", 0xf112);
        iconMap.put("fa-github-alt", 0xf113);
        iconMap.put("fa-folder-o", 0xf114);
        iconMap.put("fa-folder-open-o", 0xf115);
        iconMap.put("fa-expand-o", 0xf116);
        iconMap.put("fa-collapse-o", 0xf117);
        iconMap.put("fa-smile-o", 0xf118);
        iconMap.put("fa-frown-o", 0xf119);
        iconMap.put("fa-meh-o", 0xf11a);
        iconMap.put("fa-gamepad", 0xf11b);
        iconMap.put("fa-keyboard-o", 0xf11c);
        iconMap.put("fa-flag-o", 0xf11d);
        iconMap.put("fa-flag-checkered", 0xf11e);
        iconMap.put("fa-terminal", 0xf120);
        iconMap.put("fa-code", 0xf121);
        iconMap.put("fa-reply-all", 0xf122);
        iconMap.put("fa-mail-reply-all", 0xf122);
        iconMap.put("fa-star-half-o", 0xf123);
        iconMap.put("fa-location-arrow", 0xf124);
        iconMap.put("fa-crop", 0xf125);
        iconMap.put("fa-code-fork", 0xf126);
        iconMap.put("fa-chain-broken", 0xf127);
        iconMap.put("fa-question", 0xf128);
        iconMap.put("fa-info", 0xf129);
        iconMap.put("fa-exclamation", 0xf12a);
        iconMap.put("fa-superscript", 0xf12b);
        iconMap.put("fa-subscript", 0xf12c);
        iconMap.put("fa-eraser", 0xf12d);
        iconMap.put("fa-puzzle-piece", 0xf12e);
        iconMap.put("fa-microphone", 0xf130);
        iconMap.put("fa-microphone-slash", 0xf131);
        iconMap.put("fa-shield", 0xf132);
        iconMap.put("fa-calendar-o", 0xf133);
        iconMap.put("fa-fire-extinguisher", 0xf134);
        iconMap.put("fa-rocket", 0xf135);
        iconMap.put("fa-maxcdn", 0xf136);
        iconMap.put("fa-chevron-circle-left", 0xf137);
        iconMap.put("fa-chevron-circle-right", 0xf138);
        iconMap.put("fa-chevron-circle-up", 0xf139);
        iconMap.put("fa-chevron-circle-down", 0xf13a);
        iconMap.put("fa-html5", 0xf13b);
        iconMap.put("fa-css3", 0xf13c);
        iconMap.put("fa-anchor", 0xf13d);
        iconMap.put("fa-unlock-o", 0xf13e);
        iconMap.put("fa-bullseye", 0xf140);
        iconMap.put("fa-ellipsis-horizontal", 0xf141);
        iconMap.put("fa-ellipsis-vertical", 0xf142);
        iconMap.put("fa-rss-square", 0xf143);
        iconMap.put("fa-play-circle", 0xf144);
        iconMap.put("fa-ticket", 0xf145);
        iconMap.put("fa-minus-square", 0xf146);
        iconMap.put("fa-minus-square-o", 0xf147);
        iconMap.put("fa-level-up", 0xf148);
        iconMap.put("fa-level-down", 0xf149);
        iconMap.put("fa-check-square", 0xf14a);
        iconMap.put("fa-pencil-square", 0xf14b);
        iconMap.put("fa-external-link-square", 0xf14c);
        iconMap.put("fa-share-square", 0xf14d);
        iconMap.put("fa-compass", 0xf14e);
        iconMap.put("fa-caret-square-o-down", 0xf150);
        iconMap.put("fa-caret-square-o-up", 0xf151);
        iconMap.put("fa-caret-square-o-right", 0xf152);
        iconMap.put("fa-eur", 0xf153);
        iconMap.put("fa-gbp", 0xf154);
        iconMap.put("fa-usd", 0xf155);
        iconMap.put("fa-inr", 0xf156);
        iconMap.put("fa-jpy", 0xf157);
        iconMap.put("fa-rub", 0xf158);
        iconMap.put("fa-krw", 0xf159);
        iconMap.put("fa-btc", 0xf15a);
        iconMap.put("fa-file", 0xf15b);
        iconMap.put("fa-file-text", 0xf15c);
        iconMap.put("fa-sort-alpha-asc", 0xf15d);
        iconMap.put("fa-sort-alpha-desc", 0xf15e);
        iconMap.put("fa-sort-amount-asc", 0xf160);
        iconMap.put("fa-sort-amount-desc", 0xf161);
        iconMap.put("fa-sort-numeric-asc", 0xf162);
        iconMap.put("fa-sort-numeric-desc", 0xf163);
        iconMap.put("fa-thumbs-up", 0xf164);
        iconMap.put("fa-thumbs-down", 0xf165);
        iconMap.put("fa-youtube-square", 0xf166);
        iconMap.put("fa-youtube", 0xf167);
        iconMap.put("fa-xing", 0xf168);
        iconMap.put("fa-xing-square", 0xf169);
        iconMap.put("fa-youtube-play", 0xf16a);
        iconMap.put("fa-dropbox", 0xf16b);
        iconMap.put("fa-stack-overflow", 0xf16c);
        iconMap.put("fa-instagram", 0xf16d);
        iconMap.put("fa-flickr", 0xf16e);
        iconMap.put("fa-adn", 0xf170);
        iconMap.put("fa-bitbucket", 0xf171);
        iconMap.put("fa-bitbucket-square", 0xf172);
        iconMap.put("fa-tumblr", 0xf173);
        iconMap.put("fa-tumblr-square", 0xf174);
        iconMap.put("fa-long-arrow-down", 0xf175);
        iconMap.put("fa-long-arrow-up", 0xf176);
        iconMap.put("fa-long-arrow-left", 0xf177);
        iconMap.put("fa-long-arrow-right", 0xf178);
        iconMap.put("fa-apple", 0xf179);
        iconMap.put("fa-windows", 0xf17a);
        iconMap.put("fa-android", 0xf17b);
        iconMap.put("fa-linux", 0xf17c);
        iconMap.put("fa-dribbble", 0xf17d);
        iconMap.put("fa-skype", 0xf17e);
        iconMap.put("fa-foursquare", 0xf180);
        iconMap.put("fa-trello", 0xf181);
        iconMap.put("fa-female", 0xf182);
        iconMap.put("fa-male", 0xf183);
        iconMap.put("fa-gittip", 0xf184);
        iconMap.put("fa-sun-o", 0xf185);
        iconMap.put("fa-moon-o", 0xf186);
        iconMap.put("fa-archive", 0xf187);
        iconMap.put("fa-bug", 0xf188);
        iconMap.put("fa-vk", 0xf189);
        iconMap.put("fa-weibo", 0xf18a);
        iconMap.put("fa-renren", 0xf18b);
        iconMap.put("fa-pagelines", 0xf18c);
        iconMap.put("fa-stack-exchange", 0xf18d);
        iconMap.put("fa-arrow-circle-o-right", 0xf18e);
        iconMap.put("fa-arrow-circle-o-left", 0xf190);
        iconMap.put("fa-caret-square-o-left", 0xf191);
        iconMap.put("fa-dot-circle-o", 0xf192);
        iconMap.put("fa-wheelchair", 0xf193);
        iconMap.put("fa-vimeo-square", 0xf194);

        //Entypo
        iconMap.put("entypo-phone", 0x1F4DE);
        iconMap.put("entypo-mobile", 0x1F4F1);
        iconMap.put("entypo-mouse", 0xE789);
        iconMap.put("entypo-address", 0xE723);
        iconMap.put("entypo-mail", 0x2709);
        iconMap.put("entypo-paper-plane", 0x1F53F);
        iconMap.put("entypo-pencil", 0x270E);
        iconMap.put("entypo-feather", 0x2712);
        iconMap.put("entypo-attach", 0x1F4CE);
        iconMap.put("entypo-inbox", 0xE777);
        iconMap.put("entypo-reply", 0xE712);
        iconMap.put("entypo-reply-all", 0xE713);
        iconMap.put("entypo-forward", 0x27A6);
        iconMap.put("entypo-user", 0x1F464);
        iconMap.put("entypo-users", 0x1F465);
        iconMap.put("entypo-add-user", 0xE700);
        iconMap.put("entypo-vcard", 0xE722);
        iconMap.put("entypo-export", 0xE715);
        iconMap.put("entypo-location", 0xE724);
        iconMap.put("entypo-map", 0xE727);
        iconMap.put("entypo-compass", 0xE728);
        iconMap.put("entypo-direction", 0x27A2);
        iconMap.put("entypo-hair-cross", 0x1F3AF);
        iconMap.put("entypo-share", 0xE73C);
        iconMap.put("entypo-shareable", 0xE73E);
        iconMap.put("entypo-heart", 0x2665);
        iconMap.put("entypo-heart-empty", 0x2661);
        iconMap.put("entypo-star", 0x2605);
        iconMap.put("entypo-star-empty", 0x2606);
        iconMap.put("entypo-thumbs-up", 0x1F44D);
        iconMap.put("entypo-thumbs-down", 0x1F44E);
        iconMap.put("entypo-chat", 0xE720);
        iconMap.put("entypo-comment", 0xE718);
        iconMap.put("entypo-quote", 0x275E);
        iconMap.put("entypo-home", 0x2302);
        iconMap.put("entypo-popup", 0xE74C);
        iconMap.put("entypo-search", 0x1F50D);
        iconMap.put("entypo-flashlight", 0x1F526);
        iconMap.put("entypo-print", 0xE716);
        iconMap.put("entypo-bell", 0x1F514);
        iconMap.put("entypo-link", 0x1F517);
        iconMap.put("entypo-flag", 0x2691);
        iconMap.put("entypo-cog", 0x2699);
        iconMap.put("entypo-tools", 0x2692);
        iconMap.put("entypo-trophy", 0x1F3C6);
        iconMap.put("entypo-tag", 0xE70C);
        iconMap.put("entypo-camera", 0x1F4F7);
        iconMap.put("entypo-megaphone", 0x1F4E3);
        iconMap.put("entypo-moon", 0x263D);
        iconMap.put("entypo-palette", 0x1F3A8);
        iconMap.put("entypo-leaf", 0x1F342);
        iconMap.put("entypo-note", 0x266A);
        iconMap.put("entypo-beamed-note", 0x266B);
        iconMap.put("entypo-new", 0x1F4A5);
        iconMap.put("entypo-graduation-cap", 0x1F393);
        iconMap.put("entypo-book", 0x1F4D5);
        iconMap.put("entypo-newspaper", 0x1F4F0);
        iconMap.put("entypo-bag", 0x1F45C);
        iconMap.put("entypo-airplane", 0x2708);
        iconMap.put("entypo-lifebuoy", 0xE788);
        iconMap.put("entypo-eye", 0xE70A);
        iconMap.put("entypo-clock", 0x1F554);
        iconMap.put("entypo-mic", 0x1F3A4);
        iconMap.put("entypo-calendar", 0x1F4C5);
        iconMap.put("entypo-flash", 0x26A1);
        iconMap.put("entypo-thunder-cloud", 0x26C8);
        iconMap.put("entypo-droplet", 0x1F4A7);
        iconMap.put("entypo-cd", 0x1F4BF);
        iconMap.put("entypo-briefcase", 0x1F4BC);
        iconMap.put("entypo-air", 0x1F4A8);
        iconMap.put("entypo-hourglass", 0x23F3);
        iconMap.put("entypo-gauge", 0x1F6C7);
        iconMap.put("entypo-language", 0x1F394);
        iconMap.put("entypo-network", 0xE776);
        iconMap.put("entypo-key", 0x1F511);
        iconMap.put("entypo-battery", 0x1F50B);
        iconMap.put("entypo-bucket", 0x1F4FE);
        iconMap.put("entypo-magnet", 0xE7A1);
        iconMap.put("entypo-drive", 0x1F4FD);
        iconMap.put("entypo-cup", 0x2615);
        iconMap.put("entypo-rocket", 0x1F680);
        iconMap.put("entypo-brush", 0xE79A);
        iconMap.put("entypo-suitcase", 0x1F6C6);
        iconMap.put("entypo-traffic-cone", 0x1F6C8);
        iconMap.put("entypo-globe", 0x1F30E);
        iconMap.put("entypo-keyboard", 0x2328);
        iconMap.put("entypo-browser", 0xE74E);
        iconMap.put("entypo-publish", 0xE74D);
        iconMap.put("entypo-progress-3", 0xE76B);
        iconMap.put("entypo-progress-2", 0xE76A);
        iconMap.put("entypo-progress-1", 0xE769);
        iconMap.put("entypo-progress-0", 0xE768);
        iconMap.put("entypo-light-down", 0x1F505);
        iconMap.put("entypo-light-up", 0x1F506);
        iconMap.put("entypo-adjust", 0x25D1);
        iconMap.put("entypo-code", 0xE714);
        iconMap.put("entypo-monitor", 0x1F4BB);
        iconMap.put("entypo-infinity", 0x221E);
        iconMap.put("entypo-light-bulb", 0x1F4A1);
        iconMap.put("entypo-credit-card", 0x1F4B3);
        iconMap.put("entypo-database", 0x1F4F8);
        iconMap.put("entypo-voicemail", 0x2707);
        iconMap.put("entypo-clipboard", 0x1F4CB);
        iconMap.put("entypo-cart", 0xE73D);
        iconMap.put("entypo-box", 0x1F4E6);
        iconMap.put("entypo-ticket", 0x1F3AB);
        iconMap.put("entypo-rss", 0xE73A);
        iconMap.put("entypo-signal", 0x1F4F6);
        iconMap.put("entypo-thermometer", 0x1F4FF);
        iconMap.put("entypo-water", 0x1F4A6);
        iconMap.put("entypo-sweden", 0xF601);
        iconMap.put("entypo-line-graph", 0x1F4C8);
        iconMap.put("entypo-pie-chart", 0x25F4);
        iconMap.put("entypo-bar-graph", 0x1F4CA);
        iconMap.put("entypo-area-graph", 0x1F53E);
        iconMap.put("entypo-lock", 0x1F512);
        iconMap.put("entypo-lock-open", 0x1F513);
        iconMap.put("entypo-logout", 0xE741);
        iconMap.put("entypo-login", 0xE740);
        iconMap.put("entypo-check", 0x2713);
        iconMap.put("entypo-cross", 0x274C);
        iconMap.put("entypo-squared-minus", 0x229F);
        iconMap.put("entypo-squared-plus", 0x229E);
        iconMap.put("entypo-squared-cross", 0x274E);
        iconMap.put("entypo-circled-minus", 0x2296);
        iconMap.put("entypo-circled-plus", 0x2295);
        iconMap.put("entypo-circled-cross", 0x2716);
        iconMap.put("entypo-minus", 0x2796);
        iconMap.put("entypo-plus", 0x2795);
        iconMap.put("entypo-erase", 0x232B);
        iconMap.put("entypo-block", 0x1F6AB);
        iconMap.put("entypo-info", 0x2139);
        iconMap.put("entypo-circled-info", 0xE705);
        iconMap.put("entypo-help", 0x2753);
        iconMap.put("entypo-circled-help", 0xE704);
        iconMap.put("entypo-warning", 0x26A0);
        iconMap.put("entypo-cycle", 0x1F504);
        iconMap.put("entypo-cw", 0x27F3);
        iconMap.put("entypo-ccw", 0x27F2);
        iconMap.put("entypo-shuffle", 0x1F500);
        iconMap.put("entypo-back", 0x1F519);
        iconMap.put("entypo-level-down", 0x21B3);
        iconMap.put("entypo-retweet", 0xE717);
        iconMap.put("entypo-loop", 0x1F501);
        iconMap.put("entypo-back-in-time", 0xE771);
        iconMap.put("entypo-level-up", 0x21B0);
        iconMap.put("entypo-switch", 0x21C6);
        iconMap.put("entypo-numbered-list", 0xE005);
        iconMap.put("entypo-add-to-list", 0xE003);
        iconMap.put("entypo-layout", 0x268F);
        iconMap.put("entypo-list", 0x2630);
        iconMap.put("entypo-text-doc", 0x1F4C4);
        iconMap.put("entypo-text-doc-inverted", 0xE731);
        iconMap.put("entypo-doc", 0xE730);
        iconMap.put("entypo-docs", 0xE736);
        iconMap.put("entypo-landscape-doc", 0xE737);
        iconMap.put("entypo-picture", 0x1F304);
        iconMap.put("entypo-video", 0x1F3AC);
        iconMap.put("entypo-music", 0x1F3B5);
        iconMap.put("entypo-folder", 0x1F4C1);
        iconMap.put("entypo-archive", 0xE800);
        iconMap.put("entypo-trash", 0xE729);
        iconMap.put("entypo-upload", 0x1F4E4);
        iconMap.put("entypo-download", 0x1F4E5);
        iconMap.put("entypo-save", 0x1F4BE);
        iconMap.put("entypo-install", 0xE778);
        iconMap.put("entypo-cloud", 0x2601);
        iconMap.put("entypo-upload-cloud", 0xE711);
        iconMap.put("entypo-bookmark", 0x1F516);
        iconMap.put("entypo-bookmarks", 0x1F4D1);
        iconMap.put("entypo-open-book", 0x1F4D6);
        iconMap.put("entypo-play", 0x25B6);
        iconMap.put("entypo-pause", 0x2016);
        iconMap.put("entypo-record", 0x25CF);
        iconMap.put("entypo-stop", 0x25A0);
        iconMap.put("entypo-ff", 0x23E9);
        iconMap.put("entypo-fb", 0x23EA);
        iconMap.put("entypo-to-start", 0x23EE);
        iconMap.put("entypo-to-end", 0x23ED);
        iconMap.put("entypo-resize-full", 0xE744);
        iconMap.put("entypo-resize-small", 0xE746);
        iconMap.put("entypo-volume", 0x23F7);
        iconMap.put("entypo-sound", 0x1F50A);
        iconMap.put("entypo-mute", 0x1F507);
        iconMap.put("entypo-flow-cascade", 0x1F568);
        iconMap.put("entypo-branch", 0x1F569);
        iconMap.put("entypo-flow-tree", 0x1F56A);
        iconMap.put("entypo-flow-line", 0x1F56B);
        iconMap.put("entypo-flow-parallel", 0x1F56C);
        iconMap.put("entypo-left-bold", 0xE4AD);
        iconMap.put("entypo-down-bold", 0xE4B0);
        iconMap.put("entypo-up-bold", 0xE4AF);
        iconMap.put("entypo-right-bold", 0xE4AE);
        iconMap.put("entypo-left", 0x2B05);
        iconMap.put("entypo-down", 0x2B07);
        iconMap.put("entypo-up", 0x2B06);
        iconMap.put("entypo-right", 0x27A1);
        iconMap.put("entypo-circled-left", 0xE759);
        iconMap.put("entypo-circled-down", 0xE758);
        iconMap.put("entypo-circled-up", 0xE75B);
        iconMap.put("entypo-circled-right", 0xE75A);
        iconMap.put("entypo-triangle-left", 0x25C2);
        iconMap.put("entypo-triangle-down", 0x25BE);
        iconMap.put("entypo-triangle-up", 0x25B4);
        iconMap.put("entypo-triangle-right", 0x25B8);
        iconMap.put("entypo-chevron-left", 0xE75D);
        iconMap.put("entypo-chevron-down", 0xE75C);
        iconMap.put("entypo-chevron-up", 0xE75F);
        iconMap.put("entypo-chevron-right", 0xE75E);
        iconMap.put("entypo-chevron-small-left", 0xE761);
        iconMap.put("entypo-chevron-small-down", 0xE760);
        iconMap.put("entypo-chevron-small-up", 0xE763);
        iconMap.put("entypo-chevron-small-right", 0xE762);
        iconMap.put("entypo-chevron-thin-left", 0xE765);
        iconMap.put("entypo-chevron-thin-down", 0xE764);
        iconMap.put("entypo-chevron-thin-up", 0xE767);
        iconMap.put("entypo-chevron-thin-right", 0xE766);
        iconMap.put("entypo-left-thin", 0x2190);
        iconMap.put("entypo-down-thin", 0x2193);
        iconMap.put("entypo-up-thin", 0x2191);
        iconMap.put("entypo-right-thin", 0x2192);
        iconMap.put("entypo-arrow-combo", 0xE74F);
        iconMap.put("entypo-three-dots", 0x23F6);
        iconMap.put("entypo-two-dots", 0x23F5);
        iconMap.put("entypo-dot", 0x23F4);
        iconMap.put("entypo-cc", 0x1F545);
        iconMap.put("entypo-cc-by", 0x1F546);
        iconMap.put("entypo-cc-nc", 0x1F547);
        iconMap.put("entypo-cc-nc-eu", 0x1F548);
        iconMap.put("entypo-cc-nc-jp", 0x1F549);
        iconMap.put("entypo-cc-sa", 0x1F54A);
        iconMap.put("entypo-cc-nd", 0x1F54B);
        iconMap.put("entypo-cc-pd", 0x1F54C);
        iconMap.put("entypo-cc-zero", 0x1F54D);
        iconMap.put("entypo-cc-share", 0x1F54E);
        iconMap.put("entypo-cc-remix", 0x1F54F);
        iconMap.put("entypo-db-logo", 0x1F5F9);
        iconMap.put("entypo-db-shape", 0x1F5FA);

        //Entypo Social
        iconMap.put("esocial-github", 0xF300);
        iconMap.put("esocial-c-github", 0xF301);
        iconMap.put("esocial-flickr", 0xF303);
        iconMap.put("esocial-c-flickr", 0xF304);
        iconMap.put("esocial-vimeo", 0xF306);
        iconMap.put("esocial-c-vimeo", 0xF307);
        iconMap.put("esocial-twitter", 0xF309);
        iconMap.put("esocial-c-twitter", 0xF30A);
        iconMap.put("esocial-facebook", 0xF30C);
        iconMap.put("esocial-c-facebook", 0xF30D);
        iconMap.put("esocial-s-facebook", 0xF30E);
        iconMap.put("esocial-google-plus", 0xF30F);
        iconMap.put("esocial-c-google-plus", 0xF310);
        iconMap.put("esocial-pinterest", 0xF312);
        iconMap.put("esocial-c-pinterest", 0xF313);
        iconMap.put("esocial-tumblr", 0xF315);
        iconMap.put("esocial-c-tumblr", 0xF316);
        iconMap.put("esocial-linkedin", 0xF318);
        iconMap.put("esocial-c-linkedin", 0xF319);
        iconMap.put("esocial-dribble", 0xF31B);
        iconMap.put("esocial-c-dribble", 0xF31C);
        iconMap.put("esocial-stumbleupon", 0xF31E);
        iconMap.put("esocial-c-stumbleupon", 0xF31F);
        iconMap.put("esocial-lastfm", 0xF321);
        iconMap.put("esocial-c-lastfm", 0xF322);
        iconMap.put("esocial-rdio", 0xF324);
        iconMap.put("esocial-c-rdio", 0xF325);
        iconMap.put("esocial-spotify", 0xF327);
        iconMap.put("esocial-c-spotify", 0xF328);
        iconMap.put("esocial-qq", 0xF32A);
        iconMap.put("esocial-instagram", 0xF32D);
        iconMap.put("esocial-dropbox", 0xF330);
        iconMap.put("esocial-evernote", 0xF333);
        iconMap.put("esocial-flattr", 0xF336);
        iconMap.put("esocial-skype", 0xF339);
        iconMap.put("esocial-c-skype", 0xF33A);
        iconMap.put("esocial-renren", 0xF33C);
        iconMap.put("esocial-sina-weibo", 0xF33F);
        iconMap.put("esocial-paypal", 0xF342);
        iconMap.put("esocial-picasa", 0xF345);
        iconMap.put("esocial-soundcloud", 0xF348);
        iconMap.put("esocial-mixi", 0xF34B);
        iconMap.put("esocial-behance", 0xF34E);
        iconMap.put("esocial-google-circles", 0xF351);
        iconMap.put("esocial-vk", 0xF354);
        iconMap.put("esocial-smashing", 0xF357);

        //iconic
        iconMap.put("iconic-search", 0x1F50E);
        iconMap.put("iconic-mail", 0x2709);
        iconMap.put("iconic-heart", 0x2665);
        iconMap.put("iconic-heart-empty", 0x2661);
        iconMap.put("iconic-star", 0x2605);
        iconMap.put("iconic-user", 0x1F464);
        iconMap.put("iconic-video", 0x1F3AC);
        iconMap.put("iconic-picture", 0x1F304);
        iconMap.put("iconic-camera", 0x1F4F7);
        iconMap.put("iconic-ok", 0x2713);
        iconMap.put("iconic-ok-circle", 0x2714);
        iconMap.put("iconic-cancel", 0x2715);
        iconMap.put("iconic-cancel-circle", 0x2716);
        iconMap.put("iconic-plus", 0x2B);
        iconMap.put("iconic-plus-circle", 0x2795);
        iconMap.put("iconic-minus", 0x2D);
        iconMap.put("iconic-minus-circle", 0x2796);
        iconMap.put("iconic-help", 0x2753);
        iconMap.put("iconic-info", 0x2139);
        iconMap.put("iconic-home", 0x2302);
        iconMap.put("iconic-link", 0x1F517);
        iconMap.put("iconic-attach", 0x1F4CE);
        iconMap.put("iconic-lock", 0x1F512);
        iconMap.put("iconic-lock-empty", 0xE708);
        iconMap.put("iconic-lock-open", 0x1F513);
        iconMap.put("iconic-lock-open-empty", 0xE709);
        iconMap.put("iconic-pin", 0x1F4CC);
        iconMap.put("iconic-eye", 0xE70A);
        iconMap.put("iconic-tag", 0xE70C);
        iconMap.put("iconic-tag-empty", 0xE70E);
        iconMap.put("iconic-download", 0x1F4E5);
        iconMap.put("iconic-upload", 0x1F4E4);
        iconMap.put("iconic-download-count", 0xE710);
        iconMap.put("iconic-upload-count", 0xE711);
        iconMap.put("iconic-quote-left", 0x275D);
        iconMap.put("iconic-quote-right", 0x275E);
        iconMap.put("iconic-quote-left-alt", 0x275B);
        iconMap.put("iconic-quote-right-alt", 0x275C);
        iconMap.put("iconic-pencil", 0x270E);
        iconMap.put("iconic-pencil-neg", 0x270F);
        iconMap.put("iconic-pencil-alt", 0x2710);
        iconMap.put("iconic-undo", 0x21B6);
        iconMap.put("iconic-comment", 0xE718);
        iconMap.put("iconic-comment-inv", 0xE719);
        iconMap.put("iconic-comment-alt", 0xE71A);
        iconMap.put("iconic-comment-inv-alt", 0xE71B);
        iconMap.put("iconic-comment-alt2", 0xE71C);
        iconMap.put("iconic-comment-inv-alt2", 0xE71D);
        iconMap.put("iconic-chat", 0xE720);
        iconMap.put("iconic-chat-inv", 0xE721);
        iconMap.put("iconic-location", 0xE724);
        iconMap.put("iconic-location-inv", 0xE725);
        iconMap.put("iconic-location-alt", 0xE726);
        iconMap.put("iconic-compass", 0xE728);
        iconMap.put("iconic-trash", 0xE729);
        iconMap.put("iconic-trash-empty", 0xE72A);
        iconMap.put("iconic-doc", 0xE730);
        iconMap.put("iconic-doc-inv", 0xE731);
        iconMap.put("iconic-doc-alt", 0xE732);
        iconMap.put("iconic-doc-inv-alt", 0xE733);
        iconMap.put("iconic-article", 0xE734);
        iconMap.put("iconic-article-alt", 0xE735);
        iconMap.put("iconic-book-open", 0x1F4D6);
        iconMap.put("iconic-folder", 0x1F4C1);
        iconMap.put("iconic-folder-empty", 0x1F4C2);
        iconMap.put("iconic-box", 0x1F4E6);
        iconMap.put("iconic-rss", 0xE73A);
        iconMap.put("iconic-rss-alt", 0xE73B);
        iconMap.put("iconic-cog", 0x2699);
        iconMap.put("iconic-wrench", 0x1F527);
        iconMap.put("iconic-share", 0xE73C);
        iconMap.put("iconic-calendar", 0x1F4C5);
        iconMap.put("iconic-calendar-inv", 0xE73E);
        iconMap.put("iconic-calendar-alt", 0x1F4C6);
        iconMap.put("iconic-mic", 0x1F3A4);
        iconMap.put("iconic-volume-off", 0x1F507);
        iconMap.put("iconic-volume-up", 0x1F50A);
        iconMap.put("iconic-headphones", 0x1F3A7);
        iconMap.put("iconic-clock", 0x1F554);
        iconMap.put("iconic-lamp", 0x1F4A1);
        iconMap.put("iconic-block", 0x1F6AB);
        iconMap.put("iconic-resize-full", 0xE744);
        iconMap.put("iconic-resize-full-alt", 0xE745);
        iconMap.put("iconic-resize-small", 0xE746);
        iconMap.put("iconic-resize-small-alt", 0xE747);
        iconMap.put("iconic-resize-vertical", 0x2B0C);
        iconMap.put("iconic-resize-horizontal", 0x2B0D);
        iconMap.put("iconic-move", 0xE74A);
        iconMap.put("iconic-popup", 0xE74C);
        iconMap.put("iconic-down", 0x2193);
        iconMap.put("iconic-left", 0x2190);
        iconMap.put("iconic-right", 0x2192);
        iconMap.put("iconic-up", 0x2191);
        iconMap.put("iconic-down-circle", 0xE4A4);
        iconMap.put("iconic-left-circle", 0xE4A1);
        iconMap.put("iconic-right-circle", 0xE4A2);
        iconMap.put("iconic-up-circle", 0xE4A3);
        iconMap.put("iconic-cw", 0x27F3);
        iconMap.put("iconic-loop", 0x1F504);
        iconMap.put("iconic-loop-alt", 0x1F501);
        iconMap.put("iconic-exchange", 0x21C4);
        iconMap.put("iconic-split", 0x2387);
        iconMap.put("iconic-arrow-curved", 0x2935);
        iconMap.put("iconic-play", 0x25B6);
        iconMap.put("iconic-play-circle2", 0xE048);
        iconMap.put("iconic-stop", 0x25AA);
        iconMap.put("iconic-pause", 0x2389);
        iconMap.put("iconic-to-start", 0x23EE);
        iconMap.put("iconic-to-end", 0x23ED);
        iconMap.put("iconic-eject", 0x23CF);
        iconMap.put("iconic-target", 0x1F3AF);
        iconMap.put("iconic-signal", 0x1F4F6);
        iconMap.put("iconic-award", 0x1F3C9);
        iconMap.put("iconic-award-empty", 0xE764);
        iconMap.put("iconic-list", 0xE765);
        iconMap.put("iconic-list-nested", 0xE766);
        iconMap.put("iconic-bat-empty", 0xE772);
        iconMap.put("iconic-bat-half", 0xE774);
        iconMap.put("iconic-bat-full", 0xE774);
        iconMap.put("iconic-bat-charge", 0xE775);
        iconMap.put("iconic-mobile", 0x1F4F1);
        iconMap.put("iconic-cd", 0x1F4BF);
        iconMap.put("iconic-equalizer", 0xE795);
        iconMap.put("iconic-cursor", 0xE796);
        iconMap.put("iconic-aperture", 0xE797);
        iconMap.put("iconic-aperture-alt", 0xE798);
        iconMap.put("iconic-aperture-wheel", 0xE799);
        iconMap.put("iconic-book", 0x1F4D5);
        iconMap.put("iconic-book-alt", 0x1F4D4);
        iconMap.put("iconic-brush", 0xE79A);
        iconMap.put("iconic-brush-alt", 0xE79B);
        iconMap.put("iconic-eyedropper", 0xE79C);
        iconMap.put("iconic-layers", 0xE79D);
        iconMap.put("iconic-layers-alt", 0xE79E);
        iconMap.put("iconic-sun", 0x263C);
        iconMap.put("iconic-sun-inv", 0x2600);
        iconMap.put("iconic-cloud", 0x2601);
        iconMap.put("iconic-rain", 0x26C6);
        iconMap.put("iconic-flash", 0x26A1);
        iconMap.put("iconic-moon", 0x263E);
        iconMap.put("iconic-moon-inv", 0xE7A0);
        iconMap.put("iconic-umbrella", 0x2602);
        iconMap.put("iconic-chart-bar", 0x1F4CA);
        iconMap.put("iconic-chart-pie", 0xE7A2);
        iconMap.put("iconic-chart-pie-alt", 0xE7A3);
        iconMap.put("iconic-key", 0x26BF);
        iconMap.put("iconic-key-inv", 0x1F511);
        iconMap.put("iconic-hash", 0x23);
        iconMap.put("iconic-at", 0x40);
        iconMap.put("iconic-pilcrow", 0xB6);
        iconMap.put("iconic-dial", 0xE7A4);


    }

    public static Map<String, Integer> getIconMap()
    {
        return iconMap;
    }


    public static TypefaceManager.IconicTypeface getIconicTypeface(String icon)
    {
        if(icon.startsWith("fa"))
            return TypefaceManager.IconicTypeface.FONT_AWESOME;
        else if(icon.startsWith("entypo"))
            return TypefaceManager.IconicTypeface.ENTYPO;
        else if(icon.startsWith("esocial"))
            return TypefaceManager.IconicTypeface.ENTYPO_SOCIAL;
        else if(icon.startsWith("iconic"))
            return TypefaceManager.IconicTypeface.ICONIC;
        else return null;
    }

    public static int getIconUtfValue(String icon) {
        return iconMap.get(icon);
    }
}