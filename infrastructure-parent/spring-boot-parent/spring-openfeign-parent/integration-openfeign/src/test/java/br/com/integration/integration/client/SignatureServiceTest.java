//package br.com.integration.integration.client;
//
//import br.com.integration.integration.client.signature.model.SignatureFeignResponse;
//import br.com.integration.integration.client.signature.service.SignatureFeignService;
//import br.com.integration.integration.exception.NotFound;
//import feign.FeignException;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class SignatureServiceTest {
//
//    private static String TOKEN = "Bearer aZA4X6jmDQAxeiWaMSPaZxFhHgkHJDcVJuT5v143gHDkJ0EMqTZYq52m4YDvvGQc-25f-Bs-CFFX_ifG8PBRMw.QOr4IYoKbwmMRJzSsxObGRZekpUEHvDvaM1j5_cQfyO9X-xAyg4QC9KdK1mgwKuknCytx3GSNTK1zBfJme15yvnGwVVfmuKY545pIqARyCUlAfRTsOFeLffDZo_84ur3NQEV5rZmuC6xqSEyIU9PRIxeno1jaZ8HsoTEbCDIN4qO7JoSf0zXsn2zpSlvzWoUvJpDE-ra88FWDC6GswxCNpwgIaSnj0ibz-_Z9CU45ok08MmxPGlRHo7Q6CJITkdQ6f53IXi-qJsXjvUYNdmyeF-dJLHPQmNwNrD7tUxFRrmQC2JQSjmWtVMKzZRLxuI-tx6xmb25XQaP9dc54JVA6W4Z21nLaZajAcpSy0CAoG1tJvfFT1wX3kkfPq8o1Bm2xut9jxC4gpYWxzl8E8EQjyDgDlVs-z5OewtuZzIcLLq81IE1Vincgkigm1-fAqd8jWhxz8iSZqAoCed_m85GS1fD7ORMJFi80t0hPia7j0f3Ho4QMKZWE_rrTfeCk6Pl6ThM-l5RWF3CKkJ31DADBmVgfl_ox3Sq7vOUynIsImf1wQ6XsaRsWPMqDK-6z3NeVjLQCSJ0S7d6mbK4UDGp_eYKknlWe6yZHP82Nw2Mw7dgQjI08KUOE9cKWxlpP90fZ_hry1t6tulE14zIgJcp35BfnJYJRQMqJrtpvz3aUomfK_bV9PLCHk_RbXTNxt-UgpZjKldla1_lCSe0ibhTlK18dXzHm9tLA_NIcOWh78lB9p__FF6wSh8PcoWl-FCC8MJbx7vapttunINUgq6KB_eUkz7bhZpgnn8DO3oYY31N0mz-wXb-v6mUzGnHhii1r5gSGNI9WH4Re54Ndm3FRUMmpFP31lt4oXTCoKsJ03uQv-yWwWv2qn0bdQWoQtEFiF943JakDZzPa5oNV9B7x_7oM8PUP8pT0rSNUrGcEBaKnLCJdId75tAX93Q6UiDMLbzRr5kc0lA5pRuGDQLVo2KdOQwFhb8WlryakWJE2TbYLa9U3UTx8sD86WT85Y_EOBdvEmSrmJLe4n8g47gsdDkFSHBaBWIbpTnb0MJB9hhZthHOX4aj0GrP9fuQwwGsYN8-MmtosjJwr5uNlIdVjpF1itf589ID2XzZtAQ_xGqnO0oQ363thBgiirSUaY80-3jlEZJXJIsBoKSYy957BgrVj3A9RR4EcAeRxRXJd-ph0vpLbAirKl5d0_rfta59dwgX97Apoq18ojV94FCnCZGnaIm0mHz50s_Z_Sgu2AyZpoy7yANc_4zrby15i8UV2pQ3L8SzIVhWtcLbwytgfysem4EuvaCmoM0dzNZcVb-l5-JRjSF_VR42Rldbdpt5FYgWk49zeu3-azMDUMK-BpZFmOJPD5OQCj1LfEozVNO8rPm8sQ8ehBMHCwpuwps7ib0nGCWgA9m183X2HUdnfNsxNOXmkIaOP2GKWM5NLWav_scALhq1FucAsC5VPOcpetzv7ZgAU3FGv-Lix0FGyhjm9jLPFUME4rh4-PLQ5IPQTF7rxi6VPvYwW4h5-vQxaQteDLB4ACqFF01r1rP4JiexXi1Holhj6Gd2q5p3oDQ8SoOSym_6cUrvT4DKkP4bW-EWZPsOortJ0HT_sFJ4_7RxHUFyvi4TDQ-fWUKCx1PG6eS6YMc0DnXUlnZTrmCSJ9fTfmLHxUnu41Gs4DZQYxSPOmk-OPp3PzxaC6Uw1zN1DE_GHcFhvPW_91RqY_aT_ZUzYO3Jqcm0vna1lLijS_SVwA5N_E0GkR4J7F3XBh5GpcTJKNAs6GsiamiGOVdtZEhBIGMa4XGWIUsIiy_-Gjz539Wbvrygg6eKxo7FeJOMZ9UqMv_cK5Qm0YWRXfE1Q32MuIcAxQ_oFiemWGzmo0rZl-3tMjsDRg5bCPwdSv4a59LiVjCwdAsFWQ2N4di3YqwrhR_3GG69nHyYrjAeiQma4eRFfChW0YY1hXx9SfXFLhY1UnYsQ8_PA8yJXaXxq9U5Zz3NboNTowkk_S0jNK5oFY5ArWOq944VYEZIX2WQvwYkO4-xTGxmzovdaP-x57HepsiFZFKocGC5DwkAuIb_RaEbMNZ-UgZeTGdeAz-eF_EIuzN5L186ftRmtfTnclo07_2Xz1h4MmrW1x6y_hctIkVdvoAsb-pbkM91NJILcNGaOWn9GVkC2p8fQgXiUgFC2hNLZN2-bADmRW2YVaI1mjfiaj54PvB0PogWTjvvoi3iMCHIKo5eXjJ15Rwt3x54um7yUhNZI6kiePA_xKUZqmC5a9GND6UksT0s26zUecHVG53EoZ4_C0aveBnGfM2-ZNxzNmxS8aFeysMv4wz3GO-cuidtbIKOvnLzC6z9zg4HwKX1ezjvflnKLnMFifDhM_NLOzSds1I9ys7MxkC2OEm9EHBEny5rjQMDO55Y09xC9otJ3xZeRif0cJZ-akV7OUylWyJYjvBZ0G0ATH5jps4XZ1hUKCEHmPvH6Dtq_l-oi5pF9LhU08x-t8ZF6zfY5iakYlrpAVTrJPcbh0Tbz93dybR1MxRURr-zTKMpHRFl60NKvCCuQVUp4z7TPEUU8X7G-Z3M52c21radzwpVdF1itcNTB6hzXcdJ-1ayX5c-PJJY1JMWOl0vQEXsC_9TI2pXo0VMVlWSJRGUSqfXDcmYhRK-hXM_y7tu2zYXpOkWDelbeuOGTtRcLhqTKARhFrJuAbw3HgcT6FaGiee6iWmeUE2BCKSvNFrGVlT8m6WDaqoSqb7CZVgS57-ixikQAba0GXo45xnSj2WnxykIVDZsTKsx3YTcj5QEeUcD2R8rWA2PYlNmTp6T4RD849woYCkilsuQ_Fq6o1vZe0Puwtz-aZ16fum5xAlFAUrJqZiusPwKz1f2XFP43xfG_oyppWtit_oKhmw3jOWl0qdClgh_ZlC7yeY2Bw3FXzQUwP9KoEXhlTZMwovK0hS9N1cTeBwZY3YO-9qKI_U2TuzQSSgFqyPguIoMlpSVsSec4Jwt8e4O6hps2O349B520sWUQZQuyxT615gkpO7mUKPSruYXg1RROM_yJ-RFFF519jJOx7sZrWIhS0NLOKRvs_4qF59unXnFG7Wk_7SdlOaXhbv444A_Kj2qe9A5DTGYuVU2bDapqdIGVR4NHyFiKillTZAtFMgg_Rjrq8rqZYZkg54sj0MmEa9p9FXAHgT4B3gOWi-q3nAW2E9WCyjkiHGbdu8RmuL_XDddJdWM5DkWXYYdon4DjC6eoMwolojIrnsHNN3Ca_RREKJIj8cADJwSNGcKICXlmWcxfg5rXouN8iNGWdfiZ1KC9miu7-2Y5TzbWGI75mU5Z47oAVVFF0ljf-2af3cFYW6m5XQJXwx_lToQtP8dPJcwDwvTx7atjy1HOF-yhtwsw486mSJZOU4dHhH8o-CcJcbs0fdSpEOFrDwgDQVgqKTSm4JakvJRrLQ13THPSFfvQAfPu9-IZUfDewz1QPhbqNutF-WNCvVbu7tAvkoJB3_bz0PFX8cfkL6ba0oSlYljycoS7GsPl4eGJ9IkzogxpdMZr7VZ3slpJ9XNBwBFMFh8mxuO6MrJmN2Z-ttvSQPFfIPYGC5TrOsJ87uUmrXDBfksqQmEDQT3GsYLR3Xh-ZQ4y-1HdfA_Nc5uJY7oO3K6Pvmc6mGfJc4jOEE-SQzjDCU0Q_mXMJmjKVCsWDQT0LGDd6vDikY7bIANZo8C6u1o2ejqshV6eEUh_pdB5Zw5U_eSHqkYhIziS0nItFai1jKJb1kC1s21O-QJd8ud5j6A_XFoEXvT8iAJJdFQ4Zkwaji69vXdm4R4dn1TjMy26Ocd1sPeLMS7exQfPJcfNjTfCPoUsoiZyYH6ALVbVZXn6aiY4knJtZ4AKDSC9fUDmqpy1UQonqPCH7Gh1nht-_mEesNK6UA_P_7pKD13GoUtgpF7IXwivnE20rjsdEIm6WpnGpmZLZqO95CAxI3c-RCbERYg1xlAx-NoCSOEtvldR5YnFwEbvDfLr6z_rg7-Oz7mSU-fNphsfyVJW6mkJAEmWUIC3TJ_rjKM7ArEzPvrZIRy2OxRlBAuu4VDkxqopASNgOVZqj85k3R1NuiYcKCvj_su0RRJYclX8HcBzdnCCETKc0FQjo_z_OxCk-CXEGOHCz6PiuLr6yf_vo7KwvPY0cPo-Bk5vQfS0GHSAxZFto8Xh7DFYiuFucXHa-91j9sT2MK-x2eFARyRba3Xq_nbsPijx_EHMOCf34cx630VlGOKqpoSaYAzsQwpuBWOgEn9-qA9ve2th8xaiLR86kzGpjZFrQ3fqVH81qlUPa4PxN2CXHSEKICBuakFaSpsrLkYMvuwGAFKqYaFohCXSj65rooK3qmdzkXSEjtQqsCkFS2bb6Bak-E2FevHHmu0OxOFyTgsnjq047yM2ea_yM8eIpYKCaz0K2bTpV5My3DOwdZIlgvb6Nbw8FrpfaepESJCOB001r89Z9ErWpPZ3rz0o3jO4DbQqQELF7XayS6Vnory6_yjtNnr-iWAn6PpwGQk8L8_pLNyTV1odtPkmDQHKc3OeXYpfFlkv-916rHsO2DqELsg67MCA6komYsdUd2la4we6t9Ka9T8RDKjmmOUUUDfybvY2_5FmZ8QaHTn8zvZAOixRyGCtS907xjPjCcya4lK46rQWqrZBTFvWTRVjq-jxhE6LFE5csqvx1T8XlZ3kXHvxzk1Pp8Fk3tZfy_-_N6lGPlbST0RzuEIohvxJkmR7U8CZhH1cB1gVVrOnUEu7YDbLlz61Rt7UwW4Gghnb-G4pTtXNeiTavV0RwqGfJFocPq7iz-kKJJyEhOjdWo71cBTjhI85G408Y1rXDuw2hej6hkNDUjGM8fqmIMhiFm3e2kXPNNPO2lvlsAv8SK8RUmfLzBi12pL43gDGQxkttEndVrGpea7UV7f-Mu4u_qnAKR8F8jSi1QE2O1hbWTtqisNv8v2UCZ8ad2e5d4SHhJ1LZ-kw-gEaD-JIdp-vhhBuD2KStfRj7Y57-28ngXlbrSmpq13GWlOLr8Iu-wph1QvU1oHQ0Mm6FCBxubsoaXkMJ5jOFN3Tr0z8DwXZjq3U3Lt51xzxBhFvxxtGYtIt031LTGNOMrEcr_ygdLnMkclhbJ0a7GbNy2sQEfzQlJRnH9Tarojk8UmwuBugrhmgAMIXg5D3JZyI6ap9wEw_GfRgZMkpMvhaAd5J-KVKIRh9waFUi-tIUz9M4ljxHnXSVo2ZrNrsifVZXWRYNRFHyU__b-N-skZ0yTnhqD5c85kyjrClHQQu5ZzKs78k4YB5cVnCvLLFDRFjtTMfPUZ1PoR8l2nfoa3dAqTYENTgHw7wwrDnsJxSh4cWf9qc3IvdkQ7Be8NWT04-9pnHtRHyc_QZa_NPgiWd5jZvnsImtPFbsYUjmhMpHEAuf4uaIo8e3MWYsrQBYPLo9AY_9EmIZ2jXzSjW53LeNF-AB9jyG5sDPyIuORGuW5CUGVt4_d9qodh2F7e1oY0F07nNF9lOL5TdJbTGrUBDu2tsX0SIVASjAUW_VFxVzbzT7CpdLF3jtUGHcnNLyo12vgp9O-iCKqjffSoF6JvGa_0-z2H2WEvsQb18mvXkiyQNyACKploaTfHQlNReynpO_qV3YepIbtlnuftMcgbbi89kooF7oIbKCOkYOqYIyxnyDDM3g95qR4hOc4.U5Z2ZUwi5KJOan5on_dXfW0RnaQIG3Xb-2HB4X4HUjZtxEl0qjZBw7xrcwx-g_Z-mdCCA5XIxz-b2f39q4hLh";
//
//    @Autowired
//    private SignatureFeignService signatureService;
//
//    @Test
//    public void whenTheTokenIsRequestedReturnBearerTokenn() {
//        SignatureFeignResponse signature = signatureService.signature(TOKEN, 22191656);
//        assertNotNull(signature);
//    }
//
//    @Test
//    public void whenTheTokenIsRequestedReturnBearerToken2() {
//        StringBuilder stringBuilderException = new StringBuilder();
//        stringBuilderException.append("NotFound");
//        FeignException exception = assertThrows(NotFound.class, () -> {
//            signatureService.signature(TOKEN, 22191656);
//        });
//        assertEquals(stringBuilderException.toString(), exception.getMessage());
//    }
//
//}