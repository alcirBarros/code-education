import { LoginService } from './login.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from "@angular/router";
import { first } from 'rxjs/operators';
import { FormService } from 'projects/admin-component/src/lib/form/form.service';

@Component({
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  private retUrl: string;

  constructor(
    protected loginFormBuilder: FormBuilder,
    protected formService: FormService,
    protected route: ActivatedRoute,
    protected router: Router,
    protected loginService: LoginService,
    protected activatedRoute: ActivatedRoute
  ) { }

  formGroup = this.loginFormBuilder.group({

    email: new FormControl(null,
      [
        Validators.required,
        Validators.email,
        Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$'),
        Validators.minLength(8)
      ]
    ),

    password: [null, Validators.compose([
      Validators.required,
      Validators.minLength(6)
    ])]
  });

  ngOnInit() {
    this.activatedRoute.queryParamMap
      .subscribe(params => {
        this.retUrl = params.get('retUrl');
        //        console.log('Url origem: ' + this.retUrl);
      });
  }

  onClick(event) {
    console.log("Event Click", event);

    let email = this.formGroup.get('email').value;
    let password = this.formGroup.get('password').value;

    let loginModel = this.formGroup.value;

    console.log(loginModel.email);
    console.log(loginModel.password);

    this.loginService.login(email, password)
      .pipe(first())
      .subscribe(
        data => {
          this.formGroup.reset();

          if (this.retUrl != null) {
            this.router.navigate([this.retUrl]);
          }

          document.location.href = '/';

        },
        error => {
        });
  }

  onClickv2(event) {
    var token = 'NH5mgjFhKRW_OHrf2u-eZ652GZiTK2WJ5_sdyrrVLjZFOa8S5PPi-249_glmW872HwVMn7LNUQR85BUE3gv2pg.Z586_UeqIyP_IsYIhlV7Bwpk7Wv_FJJRYQuuNNqKUqnm6eDHJAhyZn8DO-D8LDZvkLnVi1XL2vO8TV6wCsvGgqWR8i5lBbJS8Ylm8myg8fLeK4U2CQsQRrDDvM73rpeeNeAbWSyD-RZJ8zNayTGliCEDo-IAIYYFF9NO-PdBoTwJT0XC3Cl2SRxX73ZajN7vvDe4cKG6T27ftZHw5v4hLCWQfz8l5GKmk4NVpGZdug6zTQ16fACRdHO6pi78IapaOf6QHL9IbLqgGm2XsVF73XV0afS6Xh-glcX-e85wPkKObmJ7u_EX5f_h_KWAWvSmS-_Hnz_O9mv7eitJeqwKyEID0yIiEZRwUD0vd8_IrQbcXPDkiOoTcat03OzwTQGHqKWzX9pHfXDLHSGJXRRku8MHlvQ6P8MqhX2lHZvSyV4onjJbDYWgplH4XKUo-_16kX_VhW5viTwZrN2RN__OnIcC0p1QKdoUGnfCJma8ZGMdLsn5JDqUlr5VdzfjpFCtRF92AXAeHUjH8Gv_-XP7QWPWOfw12Bywh0Z_vs4h-FSCy60gX1y-ESvITtgUBvY63Zus0QtspmKMIKHL2Kiv0VJ4h914rPHuDWl7HujeEFYP2bHBkEWrfqI6Ud66wdvHSEjMvAp0DWKiqYKeht0w-AMVsbYZ2R6qgBjRKZOdWVQ0k_aIaBu2tzfaulGDMXgM4cRF0aOweQZMaDgPRH99ez4cyQFuF81R4HKTtSUgmr5oqv4e6Q-FjwT6xCcAU1twfuCQ5R_bGGPnOQiVPcMTwDIERyIBF5wW5a75UysFH7dyFe3udPHddHT0X7B8hD1HZk21UgqWNpJ9n-C96Os7deD9y3De_qi2fmBg9DRXrozuMb2KjB7bpps1Pv4G0pa8sw0gApcPFjNBZ1CIVt9tF3-bv9szmSK8vnqn-byftaBY8uxhlRtGV18YiPhFgIIk2g51Xk9_4D_WqmSSc9PNKep8heHkRTG8KebfIcRAehmW0BFI6SuycWc6OSsMPJjB8hdV3J2OIwDqQGzfTqsh6wEwMkmDaXSo_xIVXeQDnA-GiGIK8fbvF8MRqpAPwzH2uxXsiqlYPjEnAhwVs-gQCUcAQDvoWFUzC6O_so4h10voqkB52dQunTqd4RvBiZKfwlMFGoQJiSeQpScp1G-L1jFIZvcq505ZvDJD0sCv15yWiln75U44MiY3zn6lwyYDK6KShRH5OVvTMCVwWBplvJMEce0TS85xtGrBQ2xgPNiMRxJj1SulsVfTTRL_CYd_wneddh_lGP0Maqf-m_fCVzYOMgxVcbT6X3nkAj8TNBjP3lrcLu4sssXETh-6YotzM2ceT8R01UCZhsxX434r1Czljlw9slcnBRKKd_01jbdMo9V8aXRnG1fSSPBlH0JvrQ3yU5jl3FSMkmAuKcaIm6YsxvyQCDqXyxaJ8RpKrbI-ZA5UCtorRhKQ3da8bYZZ54awM2iUhIS5tQyiuWY9aRk-cUM6Po6gQ87_AAOA1v6dPFE3Ys74vUy_a09ONk4aixPDeIslmrZlIEaCk6ruSaRQyNu2F3_EyHkZSbAVe41N0KqsX0X64EOtbgIRcZY1rQl5TeEM_Zdc0EgfKZoCgoZKLKe1-wxEA4NSjhrbfmQiwgjRk-_gJNSLhD8a0_zNnt8a0tdntk9Gc8B5FGHVloRRqgHDnKO2wAaNSESt_utJMwF_Mzh6BWxTfv5TVajShrNwAAwQmuYBmFyRHxqRRPWWJYdmYcieq6ohnGHBFqE1mJB5efL6F4XVjNJOT25Aa5Yg9qKm7vH67QFB5IB3ia5eF8xkawUIcYa9bruzjtnNW2sxKzBSsYEKw9S_9gUVk-fpscPn1YVbDyirmqTj92wqJXkLXuxcdWiAH3ATMGa-mUg_kuGMCWW7Ce2B02pW4g3Ba_ct9m92JiS3LNBLSxN4RGbhUFiPqRm9f-e0NqyAT6-QxqE81D000g3LWUUqSU4J5vlsc96K0BYQcIaDO3SLq-0XRsfG4boGeOjdganQ3j-fnrlgzF5__uO96QyBfAzHVyWyGQYYqWE-PkjqefinqSH_KkKCsQKsX7RMM3ZYK25dkDxyll3Sj8PhC6BJkAeRV0AEgTjO0aUAT90I8rpyddLVEhLd7OuMwCmpwTOgWOY-fll1NH4Z35NEXlnK9TlixAESmEFpl3IP46MRYDiJ9ub43rqAz7VsDxigqIR2z6ipeXTDYDwO1BrHjG9Errlab-n_9SiKUAdOOvAqHr0wBk1ZDu0FKg0MJZgcYc3W1ujsqPIslsBIQNOFGLEU1Ie8q-h2EpsGQIoK1cR6rUS2Hk6lIA-KNvvf5qv28bDDGRAHzLmVhFe8SI01bVpSMnBZMvxlnzfL1IaMBzqAeagwqbBPySe4-fEZD29Oys7cZDbuvWjt2X1uVCdfyhXuG0xf5Zn59bgQEBwibCDNoLKP91DbYEbqjOwN9Rd5UA8o06XxtgMU6py_i8TuxihcKj-_GOiyGyCV5elBIWYJZAQ6vjdjYgr659rDCma32c8qtssMn28qMq4FfgNsxLmRkR92nIRnDwGYa-gUUrd5_Epr21tG1CpM79B9S7BSwp9YORmUDhns-49ZQXr2v0IVGZxIVPEuEUZCPWODHbqGdoNawJ8kfOR0IbfTBHtRCfrJyTjRx0qE5WlNhv0b1ORPfuJ670pIDfnoK5DOOf3DpOaKbbzj5ybWipLScTGsjbO8AQk6d0hT-TZs8iED6A7D8VCqetmP27opisD6E3TYgjm3DpYMEDny1-VN8TdRPJlk_vHAaJsz27w_qwYgb2iVfLKsQP-rV6S61_WjDnK0hzpLnahuadWjj5NDEZ3DUD71W_lHMIw2FiV7uCYN2-GEGY139ppiNeVsntzFHnJNZF1hCoo27lqlRG6C2KxqvqQt47olxCA3HEfAjzRgAGC_dBZusbHJU1JXUiCZBdYyOtmFhENKKj1P1PAMRGe3zG3sFaaa2dy4K0yo1BpyzgoR3H0piw045PKfAg6EuWZEFdZCk3KCtC78J4edWTGTckczfz0dGA0SqUdlvvGm2Hyb3W-5IHnCRbr7jX_KaCxTlbyZnIDG3YxW0UXkR1JnPD9RjU9cFtTBXQqrvY7OcDHenMQhtFFg_ACGkD-8Ndthk-6KT4neRbti-T9uMUIs1TtRT3FazwH3pEVVI4_44Ad7_ZDsLZWPwO-PwgUF4inzck6Z5zIbD91z4t0OOa-3C33QANbHzskq_LaDOlyc9HZ3rSMGREW_IekwEPybSM4Gc90jqv4A8kSK9mZZA9ZS_gtRZQV7dEBSicvImp1wZHXChWmt3Lu5lZ1zji7ZGlPK8x7kTPf1q_eLwVDT-4amOAY0OVH2rbh6xkWTFVXQwYukMtXeKDS5S0_yaxLiG5IBHdi0EpB7emm4fEqCua9fyy09NJ4-EOFwRYENfXsVPqYv0DjaW5JbPayn8ZmxmaX4oXsHCeKEAnqelOZP0bSgrtqP7qmQb_yRL-Z_nELQPg4hSaOtAUp1v4sXy5Hyfa6xOUoAxU5ohBWL_xRr9NqbrKq--TUm8y9o2bF7Z3HBNwfUN_UVsSdN6LZv33LZDwRlH7uDYOxTjxlibUbeN2ccIqWz6XPidF3xEmC85cwbZxjfofe0M8FiDSUAvdGMdSXeRcVEx9iqGGT5TAnE8jpUDkTGMDdFAXi8WaETqXpe1VJ3Z-ZBSYLTHQMbjQeM3TZz7SdagP7B6MI-0518v-O9ajgm4myPW4Hb0LPs-oesjJw7Zrcb6_oG8kxvWIDCX2Jn7xQ3jkjCCZLwgK4asKFXqaz3gVMzivKDHufCheHAP_wNWjuajxEMsqtwX_F9xsgLyDN5_tcgsqZBql93jcSvki-F4aAE4Q_RRVjcj6zTZABxkX7cbNHZfsm-HmcIRooAfco_MFtNhwBkmgYQH242wAswlIH9gLoBHk8GjEtnVdpxvUlmQm2OcXqhTAdsqrp_psg69pVs87otfjP5XtGbUzuRnofOvC5bx6Fss4QCEnRtWp0rfJvkMv_7E-J8jCTgNyJJ2fRngkrp1RCD2Ot2S0qGwaVw6dm1tZ3ahpxRVuEMJStBkKNNzR8wot-HiE4UONl1hX8n8mc5K0LJlhE_zJlYKX37FwzrtfBMNrbxdo7Wu5qBCkO-L9SbeaOSISArDZWEq3sC52CgOQsPfNRfykC84OXxpZECYHOWmRW1qq2mEcSpedbtkDKqwPh8VnsakR99mT9QByghPJNjLYRq-zMpLSrnpI669BdH-_-BAdHODlsmZhyN_z3lsBO_qO8CDvZlsqdMfASYeJBCdf6vtGcyE4xCRMY58xQZBUcR3FFbD1fNKltv0e_4UROGFr4ZBNz_RoNKxFvDJ2lN8hyC3Drc39dIp5bhEFMMNUOJvIxC8XUcJygwhuqoMudt9eFBhqVvfBXNVgb3gDVA6d55Ah7t3K4RwHm0DtiMntLLDmAb85DND9maSBwyPhs_KyDZYAlVu4pXTICSIo4Jp5V0cvns2h9Lfm6NsplyAkil18h2OvZWbXHcN5GtJ5LRn-WZtV1Y0DMzPMiwcS1U7vBkExsEtqHJRGWLJHTm4XOU64u3Zi_2m0kQaUDdTLDpkzQvy2t2hvTIYCxTX37k3nBd4ocbvRC_NT4f3ssb-TfHZXKomCpCdNQLVXfflkWmKKk08E0QGASmZnpVIOU_5B8jWquNyXNhWH1xn94DKz8RTbfMc7OJYH0C8tI4L8cfNzCJL3exJ_Lr-k_XSvKCQ8YCVazuP7-reEbiw_UXjdq1UNqFgfvcmv9BczlxSfe44GxCkAQCpqbiJENEK0oLi9pZ5J0-TFBYuqQk-5a8ZE09mbQI-uwHnvXCOiku3eGXQwwVLNB3YVagezi3qW0_cPvBZ0dd_5vuNvNxskzMHYj13lhwqfaRMmn6PlJQaBH36LNSJuZvlJZhoa4gWKAhVQavX8DVL69CF8r7v-oTNqjNwjP31EAuHOhN5zGg9DlCaTUiwEleu-Wy38RCZrYufSBTTKo0EdoymG8jdsA5JBmBMV0VRqGk_UVp_AYJuRPBPuY_elmDlfN0y3bV0tHKd5BRVjgrqhA6qn19TADpMECatfZ93Whtf7eYH1hoGHZtGM6Y6RD1jA_A2j_izSORKub3CNInYjjhij43rhWmSAcFRDnDD_OpwCzw-o00qgukNKwsktPYnOo7UWxYe2RWmjxJpYw2ijg0ALrAk5W83QTdBoyfNrMbS6JmCkBhUfrqrGQV6KWuyNngdU4Z-6jI-MobBI-ANikbt8-aTjcT-2jaK02PH5IN61MUmlom6iUoWUYUiCtm5pzQ0fPG1QhpxO_pLS1bpYZcZpr2pKjzZ4urRODMBYOS1xMAE8OXpro52aQJn1a7Rc14oQmFb3v5y9GQslyFJ2zAH_dI0qB-M1T0I97ryGQMS1dlJZ77mtgZl61kjmISrkiJ902AcZjjJhmX1Qqme4q1Ihr-X_7Aa-HZxtgARwiD3PhApchjPD2ahNP5Rm5dWIi6pdA2vo9XgzV4ymDwzz_cKL8SjvE0qGQeK6cO9-z7T-6zEuEbtvBU24fWJATfmN3fG9Qgg20qrm8AXAWXzNT_ROZ17xd1KyDfKNoY1yhUsp0GpwDZsHaMiQcKHt-1aMin83G4R6LbFe1D91t-k71m_wUofp6V0tF0sUAK.hQHHUU9J-Bz1avxfU4Pq9GCG2ARSoD_789Jua4759cV-4XVAv2OQfgTCMV0Qc71jZbmELvBS_eOtxteLc2D9eA';
    var proposalNumber = '22192291';
    var idSimulation = '123';
    var numberSimulation = '123';
    var id = '123';

  //  window.location.href = `http://localhost/bbAssign?bb1=${token}&bb2=${proposalNumber}&state=ASSIGN-${idSimulation}-${numberSimulation}-${id}`

    window.location.href = `https://portal-ec-frontend.hml.alelo-cloud.com/bbAssign?bb1=${token}&bb2=${proposalNumber}&state=ASSIGN-${idSimulation}-${numberSimulation}-${id}`
  }
}
