export const adminLteConf = {
  skin: 'blue',
  sidebarLeftMenu: [
    { label: 'MAIN NAVIGATION', separator: true },
    { label: 'Produto', route: 'product', iconClasses: 'fa fa-tasks' },
    {
      label: 'Show case', iconClasses: 'fa fa-th-list', children: [
        {
          label: 'browser', iconClasses: 'fa fa-tasks', children: [
            { label: 'uploadfile', iconClasses: 'fa fa-tasks', route: 'showcase/browser/uploadfile' },
            { label: 'ngxtoastr', iconClasses: 'fa fa-tasks', route: 'showcase/browser/toastr/ngxtoastr' }
          ]
        },

        {
          label: 'tensorflow', iconClasses: 'fa fa-tasks', children: [
            { label: 'helloword', iconClasses: 'fa fa-tasks', route: 'showcase/tensorflow/helloord001' },
            { label: 'PacMan', iconClasses: 'fa fa-tasks', route: 'showcase/tensorflow/pacman' }
          ]
        }
      ]
    }
  ]
};
